package com.alibaba.study.spring.ioc.event;

/**
 * <pre>
 * ��MethodExecutionStatus.java��ʵ������������ִ�е�״̬ 
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
