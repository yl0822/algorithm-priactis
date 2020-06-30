/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

/**
 * @author zhenlong
 * @version $Id: FractionToDecimal.java, val 0.1 2020年05月10日 1:14 PM zhenlong Exp $
 */
public class FractionToDecimal {

    public static String fractionToDecimal(int numerator, int denominator) {
        return fraction(numerator, denominator, 0);
    }

    private static String fraction(int numerator, int denominator, int i) {
        StringBuilder sb = new StringBuilder();
        int div = numerator / denominator;
        int left = numerator % denominator;
        if (left == 0) {
            return div + "";
        }
        if (numerator / left == 10) {
            return "(" + div + ")";
        }
        sb.append(div);
        if (i == 0) {
            sb.append(".");
        }
        sb.append(fraction(left * 10, denominator, ++i));
        return sb.toString();
    }

    public static void main(String[] args) {
        //System.out.println(fractionToDecimal(1, 2));
        //System.out.println(fractionToDecimal(2, 1));
        //System.out.println(fractionToDecimal(2, 3));
        //System.out.println(fractionToDecimal(12345, 54321));
        System.out.println(fractionToDecimal(4, 333));
    }
}