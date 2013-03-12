package com.alibaba.study.spring.ioc.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <pre>
 * 类ComponentClient.java的实现描述：基于JAR包扫描的注入，使用component-scan标签
 * </pre>
 *  
 * @author yangbolin Mar 12, 2013 1:21:15 PM
 */
public class ComponentClient {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc/annotation/component-beans.xml");
        MemberService memberService = (MemberService)ctx.getBean("memberService");
        memberService.deleteMemberById(123L);
    }
}
