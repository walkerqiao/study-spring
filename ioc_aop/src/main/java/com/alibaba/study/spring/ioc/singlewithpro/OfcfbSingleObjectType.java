package com.alibaba.study.spring.ioc.singlewithpro;

import org.springframework.beans.factory.ObjectFactory;

/**
 * <pre>
 * ��OfcfbSingleObjectType.java��ʵ��������ʹ��ObjectFactoryCreatingFactoryBean�����
 * ���������ǵ���������
 * </pre>
 * 
 * @author yangbolin Mar 11, 2013 2:07:45 PM
 */
public class OfcfbSingleObjectType {

    private ObjectFactory objectFactory;

    public ProtoObjectType getProtoObject() {
        return (ProtoObjectType) this.objectFactory.getObject();
    }
    
    public ObjectFactory getObjectFactory() {
        return objectFactory;
    }
    
    public void setObjectFactory(ObjectFactory objectFactory) {
        this.objectFactory = objectFactory;
    }
}
