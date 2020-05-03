/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.topic1.cap2;

import static com.zl.aglo.Builder.buildArray;
import static com.zl.aglo.Printer.printArray;
import static com.zl.aglo.topic1.cap1.数组典型处理.swap;

/**
 * @author zhenlong
 * @version $Id: 排序算法.java, v 0.1 2020年05月02日 1:49 PM zhenlong Exp $
 */
public class 排序算法 {

    public static void main(String[] args) {
        printArray(bubbleSort(buildArray(10)));
    }

    public static int[] bubbleSort(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 1; j < ints.length - i; j++) {
                if (ints[j] < ints[j - 1]) {
                    swap(ints, j, j - 1);
                }
            }
        }
        System.out.println("--------- 冒泡排序后 --------");
        printArray(ints);
        return ints;
    }
}