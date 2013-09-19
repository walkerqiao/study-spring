/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.study.spring.ioc.component.scan;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author yangbolin Sep 10, 2013 11:45:06 AM
 */
public class ResponseDispatchPlugin implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("ResponseDispatchPlugin AfterPropertiesSet");
    }
}
