/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

/**
 *
 * @author zhenlong
 * @version $Id: HammingDistance.java, v 0.1 2020年06月16日 1:39 PM zhenlong Exp $
 */
public class HammingDistance {

    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }

    private static int hammingDistance(int x, int y){
        int z = x ^ y;
        int sum = 0;
        while (z == 0){
            sum += z & 1;
            z = z>>1;
        }
        return sum;
    }
}