package com.alibaba.study.spring.ioc.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <pre>
 * 类AnnotationConfigClient.java的实现描述：使用annotation-config标签
 * </pre>
 *  
 * @author yangbolin Mar 12, 2013 1:54:04 PM
 */
public class AnnotationConfigClient {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc/annotation/annotation-config-beans.xml");
        MemberService memberService = (MemberService)ctx.getBean("memberService");
        memberService.deleteMemberById(12345L);
    }
}
