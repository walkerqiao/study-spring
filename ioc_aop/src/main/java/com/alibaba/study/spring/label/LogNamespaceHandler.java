/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.study.spring.label;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author yangbolin Jul 6, 2013 11:15:34 AM
 */
public class LogNamespaceHandler extends NamespaceHandlerSupport
{
   
    public void init()
    {
        registerBeanDefinitionParser("log",
                new LogBeanDefinitionParser());       
    }
}
