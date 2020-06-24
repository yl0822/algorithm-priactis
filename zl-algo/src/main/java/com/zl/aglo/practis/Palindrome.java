/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

import java.util.Stack;

/**
 *
 * @author zhenlong
 * @version $Id: Palindrome.java, val 0.1 2020年05月28日 3:52 PM zhenlong Exp $
 */
public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(123321));
        System.out.println(isPalindrome(12345));
    }
    private static boolean isPalindrome(int x){
        if (x < 0){
            return false;
        }else if (x < 10){
            return true;
        }
        String str= x + "";
        char[] chars = str.toCharArray();
        int mid = chars.length / 2;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (i < mid){
                stack.push(chars[i]);
            }else {
                if (chars.length % 2 != 0 && i == mid){
                    continue;
                }else if (stack.pop() != chars[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}