/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * L.386
 * @author zhenlong
 * @version $Id: LexicalOrder.java, v 0.1 2020年06月23日 10:59 AM zhenlong Exp $
 */
public class LexicalOrder {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(lexicalOrder(13).toArray()));
    }

    private static List<Integer> lexicalOrder(int n){
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                char[] s1 = o1.toString().toCharArray();
                char[] s2 = o2.toString().toCharArray();
                int max = Math.min(s1.length, s2.length);
                int base = 0;
                while (base <= max - 1){
                    if (s1[base] == s2[base]){
                        base++;
                        continue;
                    }
                    return s1[base] - s2[base];
                }
                System.out.println("s1.length:"+s1.length+",s2.length:"+ s2.length);
                return s1.length - s2.length;
            }
        });
        return list;
    }
}