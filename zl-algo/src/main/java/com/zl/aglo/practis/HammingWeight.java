/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

/**
 *
 * @author zhenlong
 * @version $Id: HammingWeight.java, val 0.1 2020年05月28日 2:33 PM zhenlong Exp $
 */
public class HammingWeight {

    public static void main(String[] args) {
        System.out.println(hammingWeight(0b00000000000000000000000000001011));
        System.out.println(hammingWeight(0b00000000000000000000000010000000));
        System.out.println(hammingWeight(0b11111111111111111111111111111101));
    }
    private static int hammingWeight(int n){
        int cnt = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (long)Math.pow(2, i)) != 0){
                cnt++;
            }
        }
        return cnt;
    }
}