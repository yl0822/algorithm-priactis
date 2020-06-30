/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis.control;

import com.zl.aglo.practis.base.ArrayUtils;
import com.zl.aglo.practis.base.Printer;

/**
 * @author zhenlong
 * @version $Id: QuickSort.java, val 0.1 2020年05月09日 11:57 PM zhenlong Exp $
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] ints = ArrayUtils.buildArray(10);
        Printer.printArray(ints);
        p_2020_06_23(ints, 0, ints.length - 1);
        Printer.printArray(ints);
    }

    public static void quickSort(int[] ints, int low, int high) {
        if (low >= high) {
            return;
        }
        int i = low;
        int j = high;
        int base = ints[i];
        while (i < j) {
            while (i < j && ints[j] >= base) {
                j--;
            }
            // 这里为什么不带=是因为首次进入这里i的值和base一定相等，就可以触发base和j互换，否则还要处理base换到中间的逻辑
            while (i < j && ints[i] < base) {
                i++;
            }
            if (ints[i] != ints[j]){
                ArrayUtils.swap(ints, i, j);
            }
        }
        Printer.printArray(ints);
        quickSort(ints, low, i);
        quickSort(ints, i + 1, high);
    }

    private static void p_2020_06_01(int[] ints, int low, int high){
        if (low >= high){
            return;
        }
        int i = low;
        int j = high;
        int base = ints[low];
        while (i < j){
            while (i < j && ints[j] >= base){
                j--;
            }
            while (i < j && ints[i] < base){
                i++;
            }
            if (ints[i] != ints[j]){
                ArrayUtils.swap(ints, i, j);
            }
        }
        p_2020_06_01(ints, low, i);
        p_2020_06_01(ints, i + 1, high);
    }

    private static void p_2020_06_23(int[] ints, int low, int high){
        if (low >= high){
            return;
        }
        int base = ints[low];
        int i = low;
        int j = high;
        while (i < j){
            while (i < j && ints[j] >= base){
                j--;
            }
            while (i < j && ints[i] < base){
                i++;
            }
            ArrayUtils.swap(ints, i, j);
        }
        p_2020_06_23(ints, low, i);
        p_2020_06_23(ints, i + 1, high);

    }
}