/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.topic1.cap3;

import java.util.Stack;

/**
 *
 * @author zhenlong
 * @version $Id: 课后习题.java, v 0.1 2020年05月03日 4:35 PM zhenlong Exp $
 */
public class 课后习题 {

    public static void main(String[] args) {
        System.out.println(t1_3_4("{()}{[]}{[([][][]()({}{()]}))()]()}"));
    }

    private static boolean t1_3_4(String str){
        基于链表实现的常用数据结构.NodeBasedStack<Character> left =
                new 基于链表实现的常用数据结构.NodeBasedStack<>();
        for (char c : str.toCharArray()) {
            System.out.println(left.toString());
            if (c == '(' || c == '[' || c == '{'){
                left.push(c);
            }else {
                if (c == ')' && left.pop() != '('){
                    return false;
                }
                if (c == ']' && left.pop() != '['){
                    return false;
                }
                if (c == '}' && left.pop() != '{'){
                    return false;
                }
            }
        }
        return true;
    }
}