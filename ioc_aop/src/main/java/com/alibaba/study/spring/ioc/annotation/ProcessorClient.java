package com.alibaba.study.spring.ioc.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <pre>
 * 类ProcessorClient.java的实现描述：在配置文件中显式指定两个处理器器AutowiredAnnotationBeanPostProcesso以及
 * CommonAnnotationBeanPostProcessor 
 * </pre>
 * 
 * @author yangbolin Mar 12, 2013 1:52:10 PM
 */
public class ProcessorClient {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc/annotation/processor-beans.xml");
        MemberService memberService = (MemberService)ctx.getBean("memberService");
        memberService.deleteMemberById(123L);
    }
}
