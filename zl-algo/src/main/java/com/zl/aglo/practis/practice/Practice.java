/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis.practice;

/**
 * @author zhenlong
 * @version $Id: Practice.java, v 0.1 2020年06月08日 11:34 AM zhenlong Exp $
 */
public class Practice {

    public static void main(String[] args) {
        System.out.println(bs(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 2, 0, 9));
    }

    private static int bs(int[] ints, int target, int low, int high) {
        if (low == high) {
            if (ints[low] == target) {
                return low;
            } else {
                return -1;
            }
        }
        int mid = (low + high) / 2;
        if (ints[mid] >= target) {
            return bs(ints, target, low, mid);
        } else {
            return bs(ints, target, mid + 1, high);
        }
    }
}