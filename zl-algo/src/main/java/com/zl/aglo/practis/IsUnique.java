/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author zhenlong
 * @version $Id: IsUnique.java, v 0.1 2020年06月02日 8:49 PM zhenlong Exp $
 */
public class IsUnique {
    public static void main(String[] args) {
        System.out.println(isUnique("leetcode"));
        System.out.println(isUnique("abcd"));
    }

    private static boolean isUnique(String s){
        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char c : chars) {
            if (!set.add(c)){
                return false;
            }
        }
        return true;
    }
}