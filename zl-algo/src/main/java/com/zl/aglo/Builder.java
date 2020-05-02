/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo;

import static com.zl.aglo.Printer.printArray;

/**
 *
 * @author zhenlong
 * @version $Id: Builder.java, v 0.1 2020年05月02日 12:10 PM zhenlong Exp $
 */
public class Builder {

    public static int[] buildArray(int n){
        int[] ret = new int[n];
        for (int i = 0; i < n; i++) {
            ret[i] = (int)(Math.random() * 100);
        }
        System.out.println("----- 构造数组结果 -----");
        printArray(ret);
        return ret;
    }

    public static int[][] buildArray(int n, int m){
        int[][] ret = new int[n][m];
        for (int i = 0; i < n; i++) {
            ret[i] = buildArray(m);
        }
        System.out.println("----- 构造二维数组结果 -----");
        printArray(ret);
        return ret;
    }
}