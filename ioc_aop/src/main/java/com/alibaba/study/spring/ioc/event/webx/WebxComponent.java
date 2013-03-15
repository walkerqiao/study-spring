package com.alibaba.study.spring.ioc.event.webx;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class WebxComponent implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("WebxComponent event");
    }
}
