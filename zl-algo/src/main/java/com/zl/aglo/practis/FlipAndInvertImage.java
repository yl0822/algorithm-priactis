/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

import com.zl.aglo.practis.base.Printer;

/**
 * @author zhenlong
 * @version $Id: FlipAndInvertImage.java, val 0.1 2020年05月28日 8:17 PM zhenlong Exp $
 */
public class FlipAndInvertImage {

    public static void main(String[] args) {
        Printer.printArray(new int[][] {new int[] {1, 1, 0}, new int[] {1, 0, 1}, new int[] {0, 0, 0}});
        System.out.println();
        Printer.printArray(flipAndInvertImage(new int[][] {new int[] {1, 1, 0}, new int[] {1, 0, 1}, new int[] {0, 0, 0}}));
    }

    private static int[][] flipAndInvertImage(int[][] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length / 2; j++) {
                swap(ints[i], j, ints[i].length - 1 - j);
            }
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j] = ints[i][j] > 0 ? 0 : 1;
            }
        }
        return ints;
    }

    private static void swap(int[] ints, int x, int y) {
        int temp = ints[x];
        ints[x] = ints[y];
        ints[y] = temp;
    }
}