package com.alibaba.study.spring.ioc.singlewithpro;

/**
 * @author yangbolin Mar 8, 2013 9:43:54 AM
 */
public class ProtoObjectType {

    private static int counter = 0;
    private final int  index   = counter++;

    public int getIndex() {
        return this.index;
    }
}
