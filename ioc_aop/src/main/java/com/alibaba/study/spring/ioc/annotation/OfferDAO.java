package com.alibaba.study.spring.ioc.annotation;

import org.springframework.stereotype.Component;

@Component
public class OfferDAO {
    public void deleteOfferById(long id) {
        System.out.println("delete offer by id...");
    }
}
