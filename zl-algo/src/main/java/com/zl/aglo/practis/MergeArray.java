/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

import static com.zl.aglo.practis.base.ArrayUtils.buildArray;
import static com.zl.aglo.practis.base.Printer.printArray;

/**
 * @author zhenlong
 * @version $Id: MergeArray.java, val 0.1 2020年05月20日 10:54 AM zhenlong Exp $
 */
public class MergeArray {

    private static void mergeArray(int[] nums1, int m, int[] nums2, int n) {
        int i = m--+--n;
        while(n>=0) {
            System.out.println("m:"+m+",n:"+n);
            nums1[i--] = m>=0 && nums1[m]>nums2[n] ? nums1[m--] : nums2[n--];
        }
    }

    public static void main(String[] args) {
        int[] ints = new int[13];
        int[] base = buildArray(10);
        for (int i = 0; i < base.length; i++) {
            ints[i] = base[i];
        }
        for (int i = 0; i < 3; i++) {
            ints[10+i] = 0;
        }
        mergeArray(ints,  10 , new int[]{20, 50, 60}, 3);
        printArray(ints);
    }
}