/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

/**
 *
 * @author zhenlong
 * @version $Id: ReverseInt.java, val 0.1 2020年05月28日 3:43 PM zhenlong Exp $
 */
public class ReverseInt {

    public static void main(String[] args) {
        System.out.println();
    }
    private static int reverseInt(int n){
        int r = 0;
        boolean neg = false;
        if (n < 0){
            neg = true;
            n = Math.abs(n);
        }else if (n == 0){
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        while (n > 0){
            sb.append(n % 10);
            n = n / 10;
        }
        try {
            r = Integer.valueOf(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
        if (neg){
            r = -r;
        }
        return r;
    }
}