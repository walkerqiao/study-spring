package com.alibaba.study.spring.ioc.annotation;

import org.springframework.stereotype.Component;

@Component
public class MemberDAO {
    public void deleteMemberById(long id) {
        System.out.println("delete member by id......");
    }
}
