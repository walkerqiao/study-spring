package com.alibaba.study.spring.ioc.event;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * ��MethodExecutionEventPublisher.java��ʵ������������ִ���¼��ķ�����
 * </pre>
 * 
 * @author yangbolin Mar 14, 2013 5:09:25 PM
 */
public class MethodExecutionEventPublisher {

    private List<MethodExecutionEventListener> listeners = new ArrayList<MethodExecutionEventListener>();

    /**
     * <pre>
     * �����д���о��е���AOP�ˣ�����������������
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
     * �������з���ִ���¼��ļ��������൱���ǹ㲥�¼�
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
        // ע��һ������ִ�м�����
        eventPublisher.addMethodExecutionEventListener(new SimpleMethodExecutionEventListener());
        eventPublisher.methodMonitor();
    }
}
