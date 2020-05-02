/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.cap1;

import static com.zl.aglo.Builder.buildArray;

/**
 * @author zhenlong
 * @version $Id: 课后习题.java, v 0.1 2020年05月02日 3:12 PM zhenlong Exp $
 */
public class 课后习题 {

    public static void main(String[] args) {
        //t1_1_6();
        //t1_1_7_2();
        //t1_1_7_3();
        //t1_1_8();
        t1_1_10();
    }

    private static void t1_1_6() {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            System.out.print(f + ", ");
            f = f + g;
            g = f - g;
        }
        System.out.println();
    }

    private static void t1_1_7_2() {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    private static void t1_1_7_3() {
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    private static void t1_1_8() {
        System.out.println('b');
        System.out.println('b' + 'c');
        System.out.println((char) ('a' + 4));
    }

    private static void t1_1_10() {
        int[][] ints = buildArray(4, 5);
        for (int i = 0; i < ints.length; i++) {
            if (i == 0) {
                System.out.print("  ");
                for (int j = 0; j < ints[i].length; j++) {
                    System.out.print(j + "  ");
                }
            }
            System.out.println();
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(
                        ints[i][j] > 50 ?
                        ((j == 0 ? i + "" : "") + " * ") :
                        ((j == 0 ? i + "" : "") + " - ")
                );

            }
        }
    }
}