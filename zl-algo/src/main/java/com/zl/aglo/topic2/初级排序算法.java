/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.topic2;

import static com.zl.aglo.Builder.buildArray;
import static com.zl.aglo.Printer.printArray;
import static com.zl.aglo.topic1.cap1.数组典型处理.swap;

/**
 *
 * @author zhenlong
 * @version $Id: 初级排序算法.java, v 0.1 2020年05月04日 5:33 PM zhenlong Exp $
 */
public class 初级排序算法 {

    public static void main(String[] args) {
        int[] ints = buildArray(10);
        printArray(ints);
        //selectSort(ints);
        insertSort(ints);
        printArray(ints);
    }

    private static void selectSort(int[] ints){
        for (int i = 0; i < ints.length; i++) {
            int index = i;
            for (int j = i; j < ints.length; j++) {
                if (ints[j] < ints[index]){
                    index = j;
                }
            }
            swap(ints, i, index);
        }
    }

    private static void insertSort(int[] ints){
        for (int i = 1; i < ints.length; i++) {
            System.out.println("-----------------第"+i+"轮");
            for (int j = i; j > 0; j--) {
                System.out.println("----第"+j+"次");
                if (ints[j] < ints[j - 1]){
                    swap(ints, j, j - 1);
                }
                printArray(ints);
            }
        }
    }
}