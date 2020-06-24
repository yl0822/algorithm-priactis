/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

/**
 *
 * @author zhenlong
 * @version $Id: MaxNumberOfBalloons.java, val 0.1 2020年05月09日 11:27 PM zhenlong Exp $
 */
public class MaxNumberOfBalloons {

    public static int maxNumberOfBalloons(String text) {
        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;
        for (int i = 0; i < text.toCharArray().length; i++) {
            if (text.charAt(i) == 'b') {
                b++;
            }else if (text.charAt(i) == 'a') {
                a++;
            }else if (text.charAt(i) == 'l') {
                l++;
            }else if (text.charAt(i) == 'o') {
                o++;
            }else if (text.charAt(i) == 'n') {
                n++;
            }
        }
        l = l / 2;
        o = o / 2;
        return Math.min(Math.min(Math.min(Math.min(b, a), l), o), n);
    }

    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("nlaebolko"));
        System.out.println(maxNumberOfBalloons("loonbalxballpoon"));
        System.out.println(maxNumberOfBalloons("leetcode"));
    }
}