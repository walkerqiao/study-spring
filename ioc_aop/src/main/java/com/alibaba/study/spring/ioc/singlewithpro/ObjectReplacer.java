package com.alibaba.study.spring.ioc.singlewithpro;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

/**
 * <pre>
 * ��ObjectReplacer.java��ʵ��������ʹ��replaced-method��������������ǵ��������� 
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
