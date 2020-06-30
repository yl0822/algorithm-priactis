/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

import com.zl.aglo.practis.base.Printer;

import java.util.HashSet;
import java.util.Set;

/**
 * 260
 * @author zhenlong
 * @version $Id: SingleNumber.java, v 0.1 2020年06月22日 7:35 PM zhenlong Exp $
 */
public class SingleNumber {

    public static void main(String[] args) {
        Printer.printArray(singleNumber(new int[]{1,2,1,3,2,5}));
    }

    private static int[] singleNumber(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                set.remove(num);
            }
        }
        int[] ret = new int[set.size()];
        int cnt = 0;
        for (Integer integer : set) {
            ret[cnt++] = integer;
        }
        return ret;
    }
}