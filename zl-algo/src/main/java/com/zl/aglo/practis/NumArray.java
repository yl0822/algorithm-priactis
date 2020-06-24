/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

/**
 *
 * @author zhenlong
 * @version $Id: NumArray.java, val 0.1 2020年05月10日 12:12 PM zhenlong Exp $
 */
public class NumArray {

    private int[] ints;
    public NumArray(int[] nums) {
        this.ints = nums;
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        for (int k = i ; k <=j ; k++) {
            sum += ints[k];
        }
        return sum;
    }
}