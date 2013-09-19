/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.study.spring.ioc.component.scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yangbolin Sep 10, 2013 11:47:03 AM
 */
public class Client {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/ioc/component/scan/beans.xml");
        RequestDispatchPlugin rdp = (RequestDispatchPlugin) ctx.getBean("RequestDispatchPlugin");
        System.out.println(rdp);
    }
}
