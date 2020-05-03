/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.topic1.cap1;

/**
 *
 * @author zhenlong
 * @version $Id: 最大公约数.java, v 0.1 2020年05月02日 11:16 AM zhenlong Exp $
 */
public class 最大公约数 {

    public static void main(String[] args) {
        //System.out.println(gcd(1, 2));
        //System.out.println(gcd(10, 15));
        //System.out.println(gcd(5400, 9000));
        //System.out.println(gcd(9999, 99));
        //System.out.println(gcd(3249234, 4583453));
        System.out.println(gcd(2, 2));
    }

    // 也叫欧几里得算法
    public static int gcd(int p, int q){
        if (q == 0){
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }
}