package com.alibaba.study.spring.ioc.singlewithpro;

/**
 * <pre>
 * ��RmSingleObjectType.java��ʵ��������ʹ��replaced-method��������������ǵ���������
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
