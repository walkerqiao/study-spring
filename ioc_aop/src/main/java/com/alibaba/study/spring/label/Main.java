package com.alibaba.study.spring.label;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 
 * 类Main.java的实现描述：XSD文件的路径一般要和java类所在的路径保持一致
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
