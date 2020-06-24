/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author zhenlong
 * @version $Id: StringMatching.java, val 0.1 2020年05月09日 11:39 PM zhenlong Exp $
 */
public class StringMatching {
    public static List<String> stringMatching(String[] words) {
        Set<String> ret = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i == j){
                    continue;
                }
                if (words[i].contains(words[j])){
                    ret.add(words[j]);
                }
            }
        }
        return new ArrayList<>(ret);
    }

    public static void main(String[] args) {
        for (String s : stringMatching(new String[]{"mass","as","hero","superhero"})) {
            System.out.print(s + ", ");
        }
        System.out.println("\"  _   _      _ _    __        __         _     _ \n"
                + " | | | | ___| | | __\\\\ \\\\      / /__  _ __| | __| |\n"
                + " | |_| |/ _ \\\\ | |/ _ \\\\ \\\\ /\\\\ / / _ \\\\| '__| |/ _` |\n"
                + " |  _  |  __/ | | (_) \\\\ V  V / (_) | |  | | (_| |\n"
                + " |_| |_|\\\\___|_|_|\\\\___/ \\\\_/\\\\_/ \\\\___/|_|  |_|\\\\__,_|\n"
                + "\"kClosest");
    }
}