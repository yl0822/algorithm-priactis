/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zhenlong
 * @version $Id: UniqueMorseRepresentations.java, val 0.1 2020年05月28日 8:00 PM zhenlong Exp $
 */
public class UniqueMorseRepresentations {


    private static int uniqueMorseRepresentations(String[] words) {
        String[] MORES = new String[] {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
                ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> unique = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                sb.append(MORES[((int)c - 97)]);
            }
            unique.add(sb.toString());
        }
        return unique.size();
    }

    public static void main(String[] args) {
        System.out.println(((int)'c' - 97));
    }
}