package com.alibaba.study.spring.ioc.event;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * 类MethodExecutionEventPublisher.java的实现描述：方法执行事件的发布器
 * </pre>
 * 
 * @author yangbolin Mar 14, 2013 5:09:25 PM
 */
public class MethodExecutionEventPublisher {

    private List<MethodExecutionEventListener> listeners = new ArrayList<MethodExecutionEventListener>();

    /**
     * <pre>
     * 这里的写法感觉有点像AOP了，不过代码有侵入性
     * </pre>
     */
    public void methodMonitor() {
        MethodExecutionEvent event2Publish = new MethodExecutionEvent(this, "methodToMonitor");
        publishEvent(MethodExecutionStatus.BEGIN, event2Publish);
        System.out.println("process some logic unit...");
        publishEvent(MethodExecutionStatus.END, event2Publish);
    }

    /**
     * <pre>
     * 遍历所有方法执行事件的监听器，相当于是广播事件
     * </pre>
     * 
     * @param status
     * @param methodExecutionEvent
     */
    protected void publishEvent(MethodExecutionStatus status, MethodExecutionEvent methodExecutionEvent) {
        List<MethodExecutionEventListener> copyListeners = new ArrayList<MethodExecutionEventListener>(listeners);
        for (MethodExecutionEventListener listener : copyListeners) {
            if (MethodExecutionStatus.BEGIN.equals(status)) {
                listener.onMethodBegin(methodExecutionEvent);
            } else {
                listener.onMethodEnd(methodExecutionEvent);
            }
        }
    }

    public void addMethodExecutionEventListener(MethodExecutionEventListener listener) {
        this.listeners.add(listener);
    }

    public void removeListener(MethodExecutionEventListener listener) {
        if (this.listeners.contains(listener)) {
            this.listeners.remove(listener);
        }
    }

    public void removeAllListeners() {
        this.listeners.clear();
    }

    public static void main(String[] args) {
        MethodExecutionEventPublisher eventPublisher = new MethodExecutionEventPublisher();
        // 注册一个方法执行监听器
        eventPublisher.addMethodExecutionEventListener(new SimpleMethodExecutionEventListener());
        eventPublisher.methodMonitor();
    }
}
