/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

import java.util.Stack;

/**
 *
 * @author zhenlong
 * @version $Id: MinAddToMakeValid.java, v 0.1 2020年06月24日 10:05 AM zhenlong Exp $
 */
public class MinAddToMakeValid {

    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("((("));
    }

    private static int minAddToMakeValid(String s){
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '('){
                stack.push(c);
            }else {
                if (!stack.empty() && stack.peek() == '('){
                    stack.pop();
                }else {
                    stack.push(c);
                }
            }
        }
        return stack.size();
    }
}