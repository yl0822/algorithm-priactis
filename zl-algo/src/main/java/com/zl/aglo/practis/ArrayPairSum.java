/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

import com.zl.aglo.practis.control.QuickSort;

import java.util.Arrays;

/**
 *
 * @author zhenlong
 * @version $Id: ArrayPairSum.java, v 0.1 2020年06月30日 11:56 AM zhenlong Exp $
 */
public class ArrayPairSum {

    public static void main(String[] args) {
        System.out.println(arrayPairSum(new int[]{1,4,3,2}));
    }

    private static int arrayPairSum(int[] nums){
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i+=2) {
            sum += nums[i];
        }
        return sum;
    }
}