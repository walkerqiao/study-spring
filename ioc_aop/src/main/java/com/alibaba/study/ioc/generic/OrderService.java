package com.alibaba.study.ioc.generic;

/**
 * <pre>
 * ��OrderService.java��ʵ�����������ͽӿڵĶ���
 * </pre>
 *  
 * @author yangbolin Mar 23, 2013 11:31:13 AM
 */
public interface OrderService<T> {
    public T getInfo();
}
