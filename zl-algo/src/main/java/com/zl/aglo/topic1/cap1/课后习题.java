/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.topic1.cap1;

import static com.zl.aglo.Builder.buildArray;
import static com.zl.aglo.Printer.printArray;
import static com.zl.aglo.topic1.cap1.最大公约数.gcd;
import static com.zl.aglo.topic1.cap2.排序算法.bubbleSort;

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
        //t1_1_10();
        //t1_1_14(60000);
        //t1_1_15(buildArray(10), 10);
        //System.out.println(t1_1_16(6));
        //System.out.println(t1_1_18(3, 11));
        //System.out.println(t1_1_20(10));
        //System.out.println(t1_1_27(4, 2, 0.25));
        //int[] ints = buildArray(100);
        //System.out.println(t1_1_29_1(10, ints));
        //System.out.println(t1_1_29_2(10, ints));
        //t1_1_30(buildArray(4, 4));
        String str1="1";
        String str2=str1;
        str1="2";
        System.out.println(str1);
        System.out.println(str2);
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

    private static void t1_1_14(int N) {
        int ret = 2;
        int c = 0;
        while (ret <= N){
            ret *= 2;
            c++;
        }
        System.out.println(c);
    }

    private static void t1_1_15(int[] ints, int m) {
        int[] ret = new int[m];
        for (int i = 0; i < m; i++) {
            int cnt = 0;
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] == i){
                    cnt++;
                }
            }
            ret[i] = cnt;
        }
        printArray(ret);
    }

    private static String t1_1_16(int n) {
        if (n <= 0){
            return "";
        }
        return t1_1_16(n - 3) + n + t1_1_16(n - 2) + n;
    }

    private static int t1_1_18(int a, int b){
        if (b == 0){
            return 0;
        }
        if (b % 2 == 0){
            return t1_1_18(a + a, b / 2);
        }
        return t1_1_18(a + a, b / 2) + a;
    }

    private static int t1_1_20(int n) {
        if (n == 1){
            return n;
        }
        return n * t1_1_20(n - 1);
    }

    private static double t1_1_27(int N, int k, double p){
        System.out.println("N="+N+",k="+k+",p="+p);
        if (N == 0 && k == 0){
            return 1.0;
        }
        if (N < 0 || k < 0){
            return 0.0;
        }
        return (1.0 - p) * t1_1_27(N - 1, k, p) + p * t1_1_27(N - 1, k - 1, p);
    }

    private static int[] t1_1_28(int[] ints){
        // 二分查查找的前置要求是有序
        ints = bubbleSort(ints);
        // 数组数量变更需要重新申请空间
        int[] ret = new int[ints.length];
        ret[0] = ints[0];
        for (int i = 1, j = 1; i < ints.length; i++) {
            if (ints[i] != ints[i - 1]) {
                ret[j++] = ints[i];
            }
        }
        return ret;
    }

    private static int t1_1_29_1(int key, int[] ints){
        // 二分查查找的前置要求是有序
        ints = bubbleSort(ints);
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == key){
                return i;
            }
        }
        return 0;
    }

    private static int t1_1_29_2(int key, int[] ints){
        // 二分查查找的前置要求是有序
        ints = bubbleSort(ints);
        int cnt = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == key){
                cnt++;
            }
            if (ints[i] > key){
                break;
            }
        }
        return cnt;
    }

    private static void t1_1_30(int[][] ints){
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print((gcd(i, j) == 1) + " ");
            }
            System.out.println();
        }
    }
}