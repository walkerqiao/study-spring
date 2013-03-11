package com.alibaba.study.spring.ioc.singlewithpro;

/**
 * @author yangbolin Mar 8, 2013 9:41:22 AM
 */
public class SingleObjectType {
	private ProtoObjectType protoObject;

	public ProtoObjectType getProtoObject() {
		return protoObject;
	}

	public void setProtoObject(ProtoObjectType protoObject) {
		this.protoObject = protoObject;
	}
}
