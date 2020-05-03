/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.topic1.cap1;

/**
 *
 * @author zhenlong
 * @version $Id: 整数典型处理.java, v 0.1 2020年05月02日 12:48 PM zhenlong Exp $
 */
public class 整数典型处理 {

    public static void main(String[] args) {
        System.out.println(abs(2));

        System.out.println(isPrime(17));
        System.out.println(isPrime(21));
        System.out.println(isPrime(99));

        System.out.println(sqrt(2));
        System.out.println(sqrt(3));
        System.out.println(sqrt(4));
        System.out.println(sqrt(10));
        System.out.println(sqrt(136161));
    }

    private static int abs(int a){
        if (a < 0){
            return -a;
        }
        return a;
    }

    private static double abs(double a){
        if (a < 0){
            return -a;
        }
        return a;
    }

    private static boolean isPrime(int a){
        if (a % 2 == 0){
            return false;
        }
        for (int i = 3; i < sqrt(a); i += 2) {
            if (a % i == 0){
                return false;
            }
        }
        return true;
    }

    private static double sqrt(double d){
        double t = 0;
        for (double i = 0; i < d; i+=0.1) {
            if (i * i > d){
                // 获取中间值
                t = (2 * i - 1) / 2;
                break;
            }
        }
        // 期望精度
        double accuracy = 0.000000001;
        // 牛顿迭代法
        while (abs((t + d / t) / 2 - t) > accuracy) {
            t = (t + d / t) / 2;
        }
        return t;
    }

}