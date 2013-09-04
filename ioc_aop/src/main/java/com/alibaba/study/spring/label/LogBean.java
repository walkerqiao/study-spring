/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.study.spring.label;

import java.util.Date;

/**
 * @author yangbolin Jul 6, 2013 11:10:31 AM
 */
public class LogBean {

    private boolean isPrintTiem = false;

    private String  company     = "";

    public LogBean(boolean isPrintTime){
        this.isPrintTiem = isPrintTime;
    }

    public void print(String log) {
        if (this.isPrintTiem) {
            System.out.println(this.company + new Date() + ":" + log);
        } else {
            System.out.println(this.company + ":" + log);
        }
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public boolean isPrintTiem() {
        return isPrintTiem;
    }
}

