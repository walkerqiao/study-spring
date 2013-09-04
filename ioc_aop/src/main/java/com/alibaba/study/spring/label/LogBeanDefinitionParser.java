/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.study.spring.label;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * 类LogBeanDefinitionParser.java的实现描述：TODO 类实现描述
 * 
 * @author yangbolin Jul 6, 2013 11:13:57 AM
 */
public class LogBeanDefinitionParser implements BeanDefinitionParser {

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        // create a RootBeanDefinition that will serve as configuration
        // holder for the 'pattern' attribute and the 'lenient' attribute
        RootBeanDefinition beanDef = new RootBeanDefinition();
        beanDef.setBeanClass(LogBean.class);
        // never null since the schema requires it
        String pattern = element.getAttribute("isPrintTime");
        beanDef.getConstructorArgumentValues().addGenericArgumentValue(pattern);
        String company = element.getAttribute("company");
        if (StringUtils.hasText(company)) {
            beanDef.getPropertyValues().addPropertyValue("company", company);
        }
        // retrieve the ID attribute that will serve as the bean identifier in
        // the context
        String id = element.getAttribute("id");
        // create a bean definition holder to be able to register the
        // bean definition with the bean definition registry
        // (obtained through the ParserContext)
        BeanDefinitionHolder holder = new BeanDefinitionHolder(beanDef, id);
        // register the BeanDefinitionHolder (which contains the bean
        // definition)
        // with the BeanDefinitionRegistry
        BeanDefinitionReaderUtils.registerBeanDefinition(holder, parserContext.getRegistry());
        return beanDef;
    }
}
