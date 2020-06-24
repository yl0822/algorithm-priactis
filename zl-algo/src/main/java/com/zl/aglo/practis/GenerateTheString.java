/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

/**
 *
 * @author zhenlong
 * @version $Id: GenerateTheString.java, v 0.1 2020年06月02日 9:07 PM zhenlong Exp $
 */
public class GenerateTheString {

    private static String generateTheString(int n){
        char[] chars = new char[n];
        if (n % 2 == 0){
            for (int i = 0; i < n - 1; i++) {
                chars[i] = 'a';
            }
        }else {
            for (int i = 0; i < n; i++) {
                chars[i] = 'a';
            }
        }
        chars[n - 1] = 'b';
        return new String(chars);
    }
}