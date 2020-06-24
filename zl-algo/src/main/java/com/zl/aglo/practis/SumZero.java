/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

import com.algo.practis.base.Printer;

/**
 *
 * @author zhenlong
 * @version $Id: SumZero.java, val 0.1 2020年05月28日 8:07 PM zhenlong Exp $
 */
public class SumZero {

    public static void main(String[] args) {
        Printer.printArray(sumZero(4));
        Printer.printArray(sumZero(5));
        Printer.printArray(sumZero(10));
    }

    private static int[] sumZero(int n){
        int[] ints = new int[n];
        int mid = n / 2;
        for (int i = 0; i < n; i++) {
            ints[i] = n % 2 == 0 && i - mid >= 0? i - mid + 1 : i - mid;
        }
        return ints;
    }
}