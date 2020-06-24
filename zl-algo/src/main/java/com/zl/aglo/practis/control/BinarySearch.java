/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis.control;

/**
 * @author zhenlong
 * @version $Id: BinarySearch.java, val 0.1 2020年05月09日 8:22 PM zhenlong Exp $
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 23, 44, 53, 56, 60, 71,
                72, 78, 80, 82, 88, 90, 91, 93, 99};
        System.out.println(p_2020_06_01(ints, 0, ints.length - 1, 53));
    }

    private static int binarySearch(int[] ints, int low, int high, int target) {
        if (low == high) {
            if (ints[low] == target) {
                return low;
            } else {
                return -1;
            }
        }
        int mid = (low + high) / 2;
        if (ints[mid] < target) {
            return binarySearch(ints, mid + 1, high, target);
        } else {
            return binarySearch(ints, low, mid, target);
        }
    }

    private static int p_2020_06_01(int[] ints, int low, int high, int target){
        if (low == high){
            if (ints[low] == target){
                return low;
            }else {
                return -1;
            }
        }
        int mid = (low + high) / 2;
        if (ints[mid] >= target){
            return p_2020_06_01(ints, low, mid, target);
        }else {
            return p_2020_06_01(ints, mid + 1, high, target);
        }
    }
}