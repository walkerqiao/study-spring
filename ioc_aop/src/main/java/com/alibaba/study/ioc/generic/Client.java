package com.alibaba.study.ioc.generic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc/generic/generic-interface.xml");
        OrderService<BuyOffer> buyOfferOrderService = (OrderService<BuyOffer>)ctx.getBean("buyOfferOrderService");
        buyOfferOrderService.getInfo();
        
        CompanyService companyService = (CompanyService)ctx.getBean("companyService");
        companyService.getBuyOfferOrderService().getInfo();
    }
}
