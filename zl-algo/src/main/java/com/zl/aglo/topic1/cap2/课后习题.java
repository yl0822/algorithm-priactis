/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.topic1.cap2;

/**
 *
 * @author zhenlong
 * @version $Id: 课后习题.java, v 0.1 2020年05月03日 1:36 PM zhenlong Exp $
 */
public class 课后习题 {
    public static void main(String[] args) {
        System.out.println(t1_2_6("ACTGACG", "TGACGAC"));
        System.out.println(t1_2_6("ABCD", "DABC"));
        //System.out.println(t1_2_7("helloworld"));
    }

    private static boolean t1_2_6(String s, String s2){
        if (s.length() != s2.length()){
            return false;
        }
        return (s + s).contains(s2);
    }

    private static String t1_2_7(String s){
        int n = s.length();
        if (n <= 1){
            return s;
        }
        String a = s.substring(0, n / 2);
        String b = s.substring(n / 2, n);
        return t1_2_7(b) + t1_2_7(a);
    }
}