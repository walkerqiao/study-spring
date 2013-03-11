package com.alibaba.study.spring.ioc.singlewithpro;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

/**
 * <pre>
 * 类ObjectReplacer.java的实现描述：使用replaced-method来解决单例依赖非单例的情形 
 * </pre>
 * 
 * @author yangbolin Mar 11, 2013 2:35:00 PM
 */
public class ObjectReplacer implements MethodReplacer {

    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        return new ProtoObjectType();
    }
}
