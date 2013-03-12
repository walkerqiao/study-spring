package com.alibaba.study.spring.ioc.annotation;

import org.springframework.stereotype.Component;

@Component
public class CompanyDAO {
    public void deleteCompanyById(long id) {
        System.out.println("delete company by id...");
    }
}
