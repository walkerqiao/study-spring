package com.alibaba.study.spring.ioc.annotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberService {

    @Autowired
    private CompanyDAO companyDAO; // ���������Զ�ע��

    @Resource
    private OfferDAO   offerDAO;  // �Ȱ�������ע�룬���û�ж�Ӧ�����־Ͱ�������ע��

    @Resource(name = "memberDAO")
    private MemberDAO  memberDao; // ǿ��ʹ������ΪmemberDao��bean

    public void deleteMemberById(long id) {
        companyDAO.deleteCompanyById(id);
        offerDAO.deleteOfferById(id);
        memberDao.deleteMemberById(id);
    }
}
