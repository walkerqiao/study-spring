package com.alibaba.study.spring.ioc.event.webx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.SourceFilteringListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <pre>
 * 类EventClient.java的实现描述：Spring容器事件机制的测试
 * 由于一开始把事件的广播和容器的父子关系扯到一起，所以创建了两个
 * 容器，这两个容器具有父子关系，后来证明事件的广播和容器之间的关
 * 系没有关系
 * </pre>
 * 
 * @author yangbolin Mar 15, 2013 1:51:13 PM
 */
public class EventClient {

    public static void main(String[] args) {

        // 这两个容器具有父子关系
        ApplicationContext webxComponentsContext = new ClassPathXmlApplicationContext();
        ApplicationContext webxComponentContext = new ClassPathXmlApplicationContext(webxComponentsContext);

        ConfigurableApplicationContext wccs = (ConfigurableApplicationContext) webxComponentsContext;
        ConfigurableApplicationContext wcc = (ConfigurableApplicationContext) webxComponentContext;

        // 给容器注册两个监听器
        wccs.addApplicationListener(new SourceFilteringListener(wccs, new WebxComponents()));
        wcc.addApplicationListener(new SourceFilteringListener(wcc, new WebxComponent()));

        // 容器刷新的时候，相应的事件处理函数就会被执行
        wccs.refresh();
        wcc.refresh();
    }
}
