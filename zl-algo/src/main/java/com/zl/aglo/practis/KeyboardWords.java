/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author zhenlong
 * @version $Id: KeyboardWords.java, v 0.1 2020年06月22日 1:10 PM zhenlong Exp $
 */
public class KeyboardWords {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findWords(new String[] {"Hello", "Alaska", "Dad", "Peace"})));
    }

    private static String[] findWords(String[] words){
        HashSet s1 = new HashSet(){{
            for (char c : "qwertyuiop".toCharArray()) {
                add(c);
            }
        }};
        HashSet s2 = new HashSet(){{
            for (char c : "asdfghjkl".toCharArray()) {
                add(c);
            }
        }};
        HashSet s3 = new HashSet(){{
            for (char c : "zxcvbnm".toCharArray()) {
                add(c);
            }
        }};
        List<String> ret = new ArrayList<>();
        for (String word : words) {
            char[] chars = word.toLowerCase().toCharArray();
            int t = 0;
            if (s1.contains(chars[0])) {
                t = 1;
            }else if (s2.contains(chars[0])) {
                t = 2;
            } else if (s3.contains(chars[0])) {
                t = 3;
            }
            for (int i = 1; i < chars.length; i++) {
                if (s1.contains(chars[i]) && t != 1) {
                    t = 0;
                    break;
                }
                if (s2.contains(chars[i]) && t != 2) {
                    t = 0;
                    break;
                }
                if (s3.contains(chars[i]) && t != 3) {
                    t = 0;
                    break;
                }
            }
            if (t != 0){
                ret.add(word);
            }
        }
        return ret.toArray(new String[]{});
    }
}