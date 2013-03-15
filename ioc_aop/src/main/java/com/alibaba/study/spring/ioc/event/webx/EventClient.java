package com.alibaba.study.spring.ioc.event.webx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.SourceFilteringListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <pre>
 * ��EventClient.java��ʵ��������Spring�����¼����ƵĲ���
 * ����һ��ʼ���¼��Ĺ㲥�������ĸ��ӹ�ϵ����һ�����Դ���������
 * �������������������и��ӹ�ϵ������֤���¼��Ĺ㲥������֮��Ĺ�
 * ϵû�й�ϵ
 * </pre>
 * 
 * @author yangbolin Mar 15, 2013 1:51:13 PM
 */
public class EventClient {

    public static void main(String[] args) {

        // �������������и��ӹ�ϵ
        ApplicationContext webxComponentsContext = new ClassPathXmlApplicationContext();
        ApplicationContext webxComponentContext = new ClassPathXmlApplicationContext(webxComponentsContext);

        ConfigurableApplicationContext wccs = (ConfigurableApplicationContext) webxComponentsContext;
        ConfigurableApplicationContext wcc = (ConfigurableApplicationContext) webxComponentContext;

        // ������ע������������
        wccs.addApplicationListener(new SourceFilteringListener(wccs, new WebxComponents()));
        wcc.addApplicationListener(new SourceFilteringListener(wcc, new WebxComponent()));

        // ����ˢ�µ�ʱ����Ӧ���¼��������ͻᱻִ��
        wccs.refresh();
        wcc.refresh();
    }
}
