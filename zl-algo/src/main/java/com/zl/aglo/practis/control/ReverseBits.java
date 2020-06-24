/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis.control;

/**
 * @author zhenlong
 * @version $Id: ReverseBits.java, val 0.1 2020年05月28日 10:09 AM zhenlong Exp $
 */
public class ReverseBits {

    public static void main(String[] args) {
        System.out.println(reverseBits(0b11111111111111111111111111111101));
    }

    private static int reverseBits(int n) {
        int ans = 0;
        for (int bitsSize = 31; n != 0; n = n >>> 1, bitsSize--) {
            ans += (n & 1) << bitsSize;
        }
        return ans;
    }
}