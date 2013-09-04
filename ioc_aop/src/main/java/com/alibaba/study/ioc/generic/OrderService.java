package com.alibaba.study.ioc.generic;

/**
 * <pre>
 * 类OrderService.java的实现描述：泛型接口的定义
 * </pre>
 *  
 * @author yangbolin Mar 23, 2013 11:31:13 AM
 */
public interface OrderService<T> {
    public T getInfo();
}
