package com.alibaba.study.spring.ioc.singlewithpro;

/**
 * <pre>
 * 类RmSingleObjectType.java的实现描述：使用replaced-method来解决单例依赖非单例的情形
 * </pre>
 * 
 * @author yangbolin Mar 11, 2013 2:29:33 PM
 */
public class RmSingleObjectType {

    private ProtoObjectType protoObject;

    public ProtoObjectType getProtoObject() {
        return protoObject;
    }

    public void setProtoObject(ProtoObjectType protoObject) {
        this.protoObject = protoObject;
    }
}
