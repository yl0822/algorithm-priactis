/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zhenlong
 * @version $Id: SelfDividingNumbers.java, v 0.1 2020年06月01日 11:19 PM zhenlong Exp $
 */
public class SelfDividingNumbers {

    public static void main(String[] args) {
        System.out.println(check(128));
    }

    private static List<Integer> selfDividingNumbers(int low, int high){
        List<Integer> list = new ArrayList<>();
        for (int i = low; i <= high; i++) {
            if (check(i)){
                list.add(i);
            }
        }
        return list;
    }

    private static boolean check(int n){
        int c = n;
        while (n != 0 && n % 10 != 0 && c % (n % 10) == 0){
            n = n / 10;
        }
        return n == 0;
    }
}