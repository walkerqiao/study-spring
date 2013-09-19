/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.study.spring.ioc.component.scan;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;

/**
 * @author yangbolin Sep 10, 2013 1:29:56 PM
 */
public class PluginBeanNameGenerator implements BeanNameGenerator {

    @Override
    public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
        System.out.println("generate-bean-name...");
        try {
            Class cls = Class.forName(definition.getBeanClassName());
            PluginRegistry pg = (PluginRegistry)cls.getAnnotation(PluginRegistry.class);
            System.out.println(pg.pluginId());
            return pg.pluginId();
        } catch (Exception e) {
            // ignore 
        }
        return definition.getBeanClassName();
    }
}
