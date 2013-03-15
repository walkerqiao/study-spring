package com.alibaba.study.spring.ioc.event;

import java.util.EventListener;

/**
 * <pre>
 * 类MethodExecutionEventListener.java的实现描述：监听器接口
 * </pre>
 *  
 * @author yangbolin Mar 14, 2013 5:10:39 PM
 */
public interface MethodExecutionEventListener extends EventListener {
    /**
     * <pre>
     * 处理方法开始执行的时候发布的MethodExecutionEvent事件
     * </pre>
     */
    void onMethodBegin(MethodExecutionEvent evt);
    
    /**
     * <pre>
     * 处理方法执行将结束时候发布的MethodExecutionEvent事件
     * </pre>
     */
    void onMethodEnd(MethodExecutionEvent evt);
}
