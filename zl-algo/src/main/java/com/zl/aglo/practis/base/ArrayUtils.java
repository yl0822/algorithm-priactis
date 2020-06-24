/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis.base;

/**
 *
 * @author zhenlong
 * @version $Id: ArrayUtils.java, val 0.1 2020年05月19日 7:39 PM zhenlong Exp $
 */
public class ArrayUtils {

    public static void swap(int[] ints, int i, int j){
        System.out.println("swap "+ i+":"+ints[i] + "->"+j+":"+ints[j]);
        int temp = ints[i];
        ints[i] = ints[j];
        ints[j] = temp;
    }

    public static int[] buildArray(int cnt){
        int[] ret = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            ret[i] = (int)(Math.random() * 100);
        }
        return ret;
    }
}