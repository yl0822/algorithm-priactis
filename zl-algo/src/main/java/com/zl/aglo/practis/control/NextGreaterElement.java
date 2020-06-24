/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis.control;

/**
 * 556
 *
 * @author zhenlong
 * @version $Id: NextGreaterElement.java, val 0.1 2020年05月28日 5:44 PM zhenlong Exp $
 */
public class NextGreaterElement {

    public static void main(String[] args) {
        System.out.println(nextGreaterElement(1235421));
    }

    private static int nextGreaterElement(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        for (int i = chars.length - 1; i > 0; --i) {
            if (chars[i - 1] >= chars[i]) {
                continue;
            }
            int j = --i;
            while (j != chars.length - 1 && chars[j + 1] > chars[i]) {
                ++j;
            }
            swap(chars, i, j);
            for (int k = i + 1; k <= i + (chars.length - 1 - i) / 2; ++k) {
                swap(chars, k, chars.length + i - k);
            }
            try {
                return Integer.parseInt(new String(chars));
            } catch (Exception e) {
                return -1;
            }
        }
        return -1;
    }

    private static void swap(char[] chars, int i, int j) {
        char t = chars[i];
        chars[i] = chars[j];
        chars[j] = t;
    }
}