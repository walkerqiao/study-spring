package com.alibaba.study.spring.ioc.event;

/**
 * <pre>
 * 类MethodExecutionStatus.java的实现描述：方法执行的状态 
 * </pre>
 * 
 * @author yangbolin Mar 14, 2013 5:01:43 PM
 */
public enum MethodExecutionStatus {
    BEGIN("BEGIN"), END("END");

    private String value;

    MethodExecutionStatus(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
