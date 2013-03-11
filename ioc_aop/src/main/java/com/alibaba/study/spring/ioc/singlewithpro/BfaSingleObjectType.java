package com.alibaba.study.spring.ioc.singlewithpro;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class BfaSingleObjectType implements BeanFactoryAware {

    private static boolean  FIRST_GET_PROTO = true;

    private BeanFactory     beanFactory;
    @SuppressWarnings("all")
    private ProtoObjectType protoObject;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    /**
     * <pre>
     * 这里使用一个静态的boolean类型成员变量，让最初注入的那个实例被使用
     * </pre>
     * 
     * @return
     */
    public ProtoObjectType getProtoObject() {
        if (FIRST_GET_PROTO == true) {
            FIRST_GET_PROTO = false;
            return this.protoObject;
        } else {
            return (ProtoObjectType) this.beanFactory.getBean("protoObject");
        }
    }

    public void setProtoObject(ProtoObjectType protoObject) {
        this.protoObject = protoObject;
    }
}
