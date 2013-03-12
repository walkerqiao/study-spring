package com.alibaba.study.spring.ioc.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <pre>
 * ��ProcessorClient.java��ʵ���������������ļ�����ʽָ��������������AutowiredAnnotationBeanPostProcesso�Լ�
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
