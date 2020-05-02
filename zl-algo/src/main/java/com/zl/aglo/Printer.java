/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo;

/**
 *
 * @author zhenlong
 * @version $Id: Printer.java, v 0.1 2020年05月02日 12:10 PM zhenlong Exp $
 */
public class Printer {

    public static void printArray(int[] ints){
        for (int j = 0; j < ints.length; j++) {
            System.out.print(ints[j] + ", ");
        }
        System.out.println();
    }

    public static void printArray(int[][] ints){
        System.out.println("------------ ");
        for (int i = 0; i < ints.length; i++) {
            printArray(ints[i]);
        }
        System.out.println("------------ ");
    }
}