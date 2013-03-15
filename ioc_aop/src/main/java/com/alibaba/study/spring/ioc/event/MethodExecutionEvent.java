package com.alibaba.study.spring.ioc.event;

import java.util.EventObject;

/**
 * <pre>
 * ��MethodExecutionEvent.java��ʵ��������������ִ���¼�
 * </pre>
 * 
 * @author yangbolin Mar 14, 2013 5:03:15 PM
 */
public class MethodExecutionEvent extends EventObject {

    private static final long serialVersionUID = 1L;
    private String            methodName;

    public MethodExecutionEvent(Object source){
        super(source);
    }

    public MethodExecutionEvent(Object source, String methodName){
        super(source);
        this.methodName = methodName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }
}
