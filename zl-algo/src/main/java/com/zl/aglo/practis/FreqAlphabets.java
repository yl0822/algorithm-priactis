/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author zhenlong
 * @version $Id: FreqAlphabets.java, val 0.1 2020年05月29日 7:17 PM zhenlong Exp $
 */
public class FreqAlphabets {

    public static void main(String[] args) {
        System.out.println(freqAlphabets2("1326#"));
        for (int i = 1; i < 200; i++) {
            System.out.print(i +":"+(char)i + ", ");
            if (i % 10 == 0){
                System.out.println();
            }
        }
    }

    private static String freqAlphabets(String s){
        Map<String, Character> map = new HashMap<>();
        Map<Character, String> mapR = new HashMap<>();
        for (int i = 1; i <= 26; i++) {
            if (i < 10){
                map.put(i + "", (char)('a' + i - 1));
                mapR.put((char)('a' + i - 1), i + "");
            }else {
                map.put(i + "#", (char)('a' + i - 1));
            }
        }
        map.put("0", '$');
        mapR.put('$', "0");
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '#'){
                String c1 = mapR.get(stack.pop());
                String c2 = mapR.get(stack.pop());
                char c = map.get(c2 + c1 +"#");
                stack.push(c);
            }else {
                stack.push(map.get(chars[i] + ""));
            }
        }
        char[] ret = new char[stack.size()];
        int i = stack.size() - 1;
        while (!stack.empty()){
            ret[i--] = stack.pop();
        }
        return new String(ret);
    }

    private static String freqAlphabets2(String s){
        Map<String, Character> map = new HashMap<>();
        Map<Character, String> mapR = new HashMap<>();
        for (int i = 1; i <= 26; i++) {
            if (i < 10){
                map.put(i + "", (char)('a' + i - 1));
                mapR.put((char)('a' + i - 1), i + "");
            }else {
                map.put(i + "#", (char)('a' + i - 1));
            }
        }
        map.put("0", '$');
        mapR.put('$', "0");
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            stack.push(chars[i]);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.empty()){
            char c = stack.pop();
            if (c == '#'){
                char c1 = stack.pop();
                char c2 = stack.pop();
                sb.append(map.get(c2 + "" + c1 + "#"));
            }else {
                sb.append(map.get(c + ""));
            }
        }
        return sb.reverse().toString();
    }
}