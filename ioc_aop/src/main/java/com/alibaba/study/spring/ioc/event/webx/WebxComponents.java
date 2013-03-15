package com.alibaba.study.spring.ioc.event.webx;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class WebxComponents implements ApplicationListener{

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("WebxComponents event...");
    }
}
