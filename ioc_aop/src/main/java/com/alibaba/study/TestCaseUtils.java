/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.study;

import java.util.Random;

/**
 * 类TestCaseUtils.java的实现描述：TODO 类实现描述
 * 
 * @author yangbolin Jun 27, 2013 10:45:13 AM
 */
public class TestCaseUtils {

    private static Random random = new Random(10);
    private static char[] array  = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i','j', 'k', 'l', 'm', 'n', 'o',
            'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' , '.',',', '-'};

    public static String generateFixedCNString(int len) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; ++i) {
            int rand = random.nextInt(10) % 3;
            if (rand == 0) {
                sb.append("阿");
            } else if (rand  == 1) {
                sb.append("大");
            } else if (rand  == 2) {
                sb.append("小");
            } 
        }
        System.out.println(sb.length());
        return sb.toString();
    }

    public static String generateFixedENString(int len) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; ++i) {
            sb.append(array[random.nextInt(29)]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        
        System.out.println(generateFixedCNString(256));
        System.out.println(generateFixedENString(110));
        
    }
}
