package com.alibaba.study.spring.ioc.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <pre>
 * ��ComponentClient.java��ʵ������������JAR��ɨ���ע�룬ʹ��component-scan��ǩ
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
