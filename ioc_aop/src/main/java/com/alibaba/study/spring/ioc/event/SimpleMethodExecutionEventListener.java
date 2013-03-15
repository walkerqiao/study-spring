package com.alibaba.study.spring.ioc.event;

/**
 * <pre>
 * 类SimpleMethodExecutionEventListener.java的实现描述：方法执行事件的监听器
 * </pre>
 *  
 * @author yangbolin Mar 14, 2013 5:10:01 PM
 */
public class SimpleMethodExecutionEventListener implements MethodExecutionEventListener {

    @Override
    public void onMethodBegin(MethodExecutionEvent evt) {
        String methodName = evt.getMethodName();
        System.out.println("start to execute the method["  + methodName + "]");
    }

    @Override
    public void onMethodEnd(MethodExecutionEvent evt) {
        String methodName = evt.getMethodName();
        System.out.println("finished to execute the method[" + methodName + "]");
    }

}
