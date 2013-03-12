package com.alibaba.study.spring.ioc.singlewithpro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <pre>
 * ���ڽ��Spring�е���bean����ԭ��bean�ļ��ֲ���
 * 1.look-up
 * 2.replaced-method
 * 3.BeanFactoryAware
 * 4.bjectFactoryCreatingFactoryBean
 * </pre>
 * 
 * @author yangbolin Mar 11, 2013 2:44:44 PM
 */
public class Client {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc/singlewithproto/beans.xml");

        // 0. ��ʱ����bean�е�ԭ��bean���ᱻˢ�£�����ÿ�λ�ȡ����ԭ��bean����һ����
        SingleObjectType singleObject11 = (SingleObjectType) ctx.getBean("singleObject1");
        System.out.println(singleObject11.getProtoObject().getIndex()); // output 0
        SingleObjectType singleObject12 = (SingleObjectType) ctx.getBean("singleObject1");
        System.out.println(singleObject12.getProtoObject().getIndex()); // output 0

        // 1. ʹ��factory-method��������������ǵ���������
        SingleObjectType singleObject21 = (SingleObjectType) ctx.getBean("singleObject2");
        System.out.println(singleObject21.getProtoObject().getIndex());
        SingleObjectType singleObject22 = (SingleObjectType) ctx.getBean("singleObject2");
        System.out.println(singleObject22.getProtoObject().getIndex());

        // 2. ʹ��BeanFactoryAware��������������ǵ���������
        BfaSingleObjectType bfaSingleObject1 = (BfaSingleObjectType) ctx.getBean("bfaSingleObject");
        System.out.println(bfaSingleObject1.getProtoObject().getIndex());
        BfaSingleObjectType bfaSingleObject2 = (BfaSingleObjectType) ctx.getBean("bfaSingleObject");
        System.out.println(bfaSingleObject2.getProtoObject().getIndex());

        // 3. ʹ��ObjectFactoryCreatingFactoryBean��������������ǵ���������
        OfcfbSingleObjectType ofcfbSingleObject1 = (OfcfbSingleObjectType) ctx.getBean("ofcfbSingleObject");
        System.out.println(ofcfbSingleObject1.getProtoObject().getIndex());
        OfcfbSingleObjectType ofcfbSingleObject2 = (OfcfbSingleObjectType) ctx.getBean("ofcfbSingleObject");
        System.out.println(ofcfbSingleObject2.getProtoObject().getIndex());

        // 4.ʹ��replaced-method��������������ǵ���������
        RmSingleObjectType rmSingleObject1 = (RmSingleObjectType) ctx.getBean("rmSingleObject");
        System.out.println(rmSingleObject1.getProtoObject().getIndex());
        RmSingleObjectType rmSingleObject2 = (RmSingleObjectType) ctx.getBean("rmSingleObject");
        System.out.println(rmSingleObject2.getProtoObject().getIndex());
        
    }
}
