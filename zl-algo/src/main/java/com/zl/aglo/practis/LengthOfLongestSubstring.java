/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

/**
 *
 * @author zhenlong
 * @version $Id: LengthOfLongestSubstring.java, val 0.1 2020年05月09日 9:53 PM zhenlong Exp $
 */
public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("au"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0){
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        int l = 1;
        for (int i = 0; i < c.length; i++) {
            sb.append(c[i]);
            for (int j = i + 1; j < c.length; j++) {
                if (sb.toString().contains(String.valueOf(c[j]))) {
                    l = Math.max(l, sb.length());

                    break;
                }
                sb.append(c[j]);
            }
            l = Math.max(l, sb.length());
            sb = new StringBuilder();

        }
        return l;
    }
}