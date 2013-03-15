package com.alibaba.study.spring.ioc.event;

import java.util.EventListener;

/**
 * <pre>
 * ��MethodExecutionEventListener.java��ʵ���������������ӿ�
 * </pre>
 *  
 * @author yangbolin Mar 14, 2013 5:10:39 PM
 */
public interface MethodExecutionEventListener extends EventListener {
    /**
     * <pre>
     * ��������ʼִ�е�ʱ�򷢲���MethodExecutionEvent�¼�
     * </pre>
     */
    void onMethodBegin(MethodExecutionEvent evt);
    
    /**
     * <pre>
     * ������ִ�н�����ʱ�򷢲���MethodExecutionEvent�¼�
     * </pre>
     */
    void onMethodEnd(MethodExecutionEvent evt);
}
