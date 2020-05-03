/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.topic1.cap1;

import static com.zl.aglo.Builder.buildArray;
import static com.zl.aglo.Printer.printArray;

/**
 *
 * @author zhenlong
 * @version $Id: 数组典型处理.java, v 0.1 2020年05月02日 11:34 AM zhenlong Exp $
 */
public class 数组典型处理 {

    public static void main(String[] args) {
        System.out.println("----- 获取数组最大值:"+max(buildArray(10)));
        System.out.println("----- 获取数组平均值"+avg(buildArray(10)));
        int[] ints = buildArray(10);
        System.out.println("----- 拷贝数组:"+(copy(ints) == ints));
        System.out.println("----- 反转数组");
        printArray(revert(buildArray(10)));
        System.out.println("----- 矩阵相乘");
        printArray(multiMatrix(buildArray(4,3), buildArray(3, 5)));
        printArray(switchMatrix(buildArray(3, 5)));
    }

    private static int max(int[] ints){
        int ret = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] > ret){
                ret = ints[i];
            }
        }
        return ret;
    }

    private static double avg(int[] ints){
        int ret = 0;
        for (int i = 0; i < ints.length; i++) {
            ret += ints[i];
        }
        return ret / ints.length;
    }

    // 数组拷贝
    private static int[] copy(int[] ints){
        int[] ret = new int[ints.length];
        for (int i = 0; i < ints.length; i++) {
            ret[i] = ints[i];
        }
        return ret;
    }

    // 数组截断
    public static int[] cat(int[] ints, int m, int n){
        int[] ret = new int[n - m + 1];
        for (int i = m; i <= n; i++) {
            ret[i - m] = ints[i];
        }
        return ret;
    }

    // 位置交换
    public static void swap(int[] ints, int m, int n){
        int temp = ints[m];
        ints[m] = ints[n];
        ints[n] = temp;
    }

    // 数组反转
    private static int[] revert(int[] ints){
        for (int i = 0, j = ints.length - 1; i < j; i++, j--) {
            int temp = ints[i];
            ints[i] = ints[j];
            ints[j] = temp;
        }
        return ints;
    }

    // 矩阵相乘
    private static int[][] multiMatrix(int[][] ints1, int[][] ints2){
        int[][] ret = new int[ints1.length][ints2[0].length];
        for (int i = 0; i < ints1.length; i++) {
            for (int j = 0; j < ints2[0].length; j++) {
                int t = 0;
                for (int k = 0; k < ints2.length; k++) {
                    t += ints1[i][k] * ints2[k][j];
                }
                ret[i][j] = t;
            }
        }
        return ret;
    }

    // 矩阵转换
    private static int[][] switchMatrix(int[][] ints){
        int row = ints.length;
        int col  = ints[0].length;
        int[][] ret = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ret[j][i] = ints[i][j];
            }
        }
        return ret;
    }
}