/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

/**
 *
 * @author zhenlong
 * @version $Id: FindComplement.java, v 0.1 2020年06月22日 10:59 AM zhenlong Exp $
 */
public class FindComplement {
    public static void main(String[] args) {
        System.out.println(findComplement(2));
    }

    private static int findComplement(int num){
        char[] chars = Integer.toBinaryString(num).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = chars[i] == '1' ? '0' : '1';
        }
        int ret = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            ret += (chars[i] == '1' ? 1 : 0) * Math.pow(2, (chars.length - 1 - i));
        }
        return ret;
    }
}