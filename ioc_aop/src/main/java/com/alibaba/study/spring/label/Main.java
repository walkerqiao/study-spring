package com.alibaba.study.spring.label;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 
 * ��Main.java��ʵ��������XSD�ļ���·��һ��Ҫ��java�����ڵ�·������һ��
 * @author yangbolin Jul 6, 2013 3:49:28 PM
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc/label/applicationContext.xml");
        LogBean logBean = (LogBean)ctx.getBean("iplatformLog");
        System.out.println(logBean.getCompany());
        logBean.print("custom-label");
    }
}
