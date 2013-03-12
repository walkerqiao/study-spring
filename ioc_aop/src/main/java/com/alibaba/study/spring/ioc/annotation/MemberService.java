package com.alibaba.study.spring.ioc.annotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberService {

    @Autowired
    private CompanyDAO companyDAO; // 按照类型自动注入

    @Resource
    private OfferDAO   offerDAO;  // 先按照名字注入，如果没有对应的名字就按照类型注入

    @Resource(name = "memberDAO")
    private MemberDAO  memberDao; // 强制使用名字为memberDao的bean

    public void deleteMemberById(long id) {
        companyDAO.deleteCompanyById(id);
        offerDAO.deleteOfferById(id);
        memberDao.deleteMemberById(id);
    }
}
