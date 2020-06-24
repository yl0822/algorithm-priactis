/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

/**
 *
 * @author zhenlong
 * @version $Id: MinLargeThan.java, val 0.1 2020年05月20日 3:26 PM zhenlong Exp $
 */
public class MinLargeThan {

    public static void main(String[] args) {
        System.out.println(minLargeThan(1234));
        System.out.println(minLargeThan(1235421));
    }

    private static int minLargeThan(int n){
        if (n < 10){
            return -1;
        }
        char[] chars = String.valueOf(n).toCharArray();
        int i;
        for (i = chars.length - 1; i > 0; i--) {
            if (chars[i - 1] < chars[i]){
                break;
            }
        }
        System.out.println(i);
        char c = chars[i - 1];
        for (int i1 = i; i1 < chars.length; i1++) {
            if (c > chars[i1]){
                System.out.println("swap:"+chars[i - 1] +","+chars[i1-1]);
                chars[i - 1] = chars[i1 - 1];
                chars[i1 - 1] = c;
                break;
            }
            if ( i1 >= chars.length - 1){
                System.out.println("swap:"+chars[i - 1] +","+chars[i1-1]);
                chars[i - 1] = chars[i1];
                chars[i1] = c;
                break;
            }
        }
        for (int j =i; j < chars.length; j++) {
            for (int k = i; k < chars.length; k++) {
                if (chars[k] > chars[j]) {
                    char tem = chars[k];
                    chars[k] = chars[j];
                    chars[j] = tem;
                }
            }
        }
        return Integer.valueOf(String.valueOf(chars));
    }
}