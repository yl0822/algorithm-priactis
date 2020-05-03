/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.topic1.cap3;

import java.util.Stack;

/**
 *
 * @author zhenlong
 * @version $Id: 双栈算术表达式求值算法.java, v 0.1 2020年05月03日 2:02 PM zhenlong Exp $
 */
public class 双栈算术表达式求值算法 {

    public static void main(String[] args) {
        System.out.println(eval("((1 + ((2 * 3) * ( 9 / 3))) - 4)"));
    }

    private static int eval(String str){
        Stack<Character> ops = new Stack<>();
        Stack<Integer> vals = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '+' || c == '-' || c == '*' || c == '/'){
                ops.push(c);
            }else if (c == ')'){
                char op = ops.pop();
                int v = vals.pop();
                if (op == '+'){
                    v = vals.pop() + v;
                }else if (op == '-'){
                    v = vals.pop() - v;
                }else if (op == '*'){
                    v = vals.pop() * v;
                }else if (op == '/'){
                    v = vals.pop() / v;
                }
                vals.push(v);
            }else {
                vals.push(Integer.valueOf(c+""));
            }
        }
        return vals.pop();
    }
}