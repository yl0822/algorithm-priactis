/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.topic2;

import static com.zl.aglo.Printer.printArray;
import static com.zl.aglo.topic1.cap1.数组典型处理.swap;

/**
 * @author zhenlong
 * @version $Id: 快速排序.java, v 0.1 2020年05月05日 1:35 PM zhenlong Exp $
 */
public class 快速排序 {

    public static void main(String[] args) {
        int[] ints = {5,1,7,0,9,4,8,2,3};
        //int[] ints = {8, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        printArray(ints);
        quickSort(ints, 0, ints.length - 1);
        printArray(ints);
    }

    private static int[] quickSort(int[] arr, int start, int end) {
        // 这里的实现是每次基准值都参与到交换
        // 还有一种办法是基准值最后参与到交换
        int pivot = arr[start];
        int i = start;
        int j = end;
        while (i < j) {
            // 从右向左扫到第一个小于等于基准值的位置
            while ((i < j) && (arr[j] > pivot)) {
                j--;
            }
            // 从左向右扫到第一个大于等于基准值的位置
            while ((i < j) && (arr[i] < pivot)) {
                i++;
            }
            if ((arr[i] == arr[j]) && (i < j)) {
                // 特殊地:三者相等的情况没必要交换，左继续向右扫
                i++;
            } else {
                // 交换
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // 子数组长度大于1继续递归
        if (i - 1 > start) {
            quickSort(arr, start, i - 1);
        }
        // 右边也一样
        if (j + 1 < end) {
            quickSort(arr, j + 1, end);
        }
        return (arr);
    }

    private static void qs(int[] ints, int low, int high){
        if (low >= high){
            return;
        }
        int j = partition(ints, low, high);
        qs(ints, low, j - 1);
        qs(ints, j + 1, high);
    }

    private static int partition(int[] ints, int low, int high){
        int base = ints[low];
        int i = low;
        int j = high;
        while (i < j){
            while ((i < j) && ints[i] < base){
                i++;
            }
            while ((i < j) && ints[j] > base){
                j--;
            }
            if ((i < j) && ints[i] == ints[j]){
                i++;
            }else {
                swap(ints, i, j);
            }
        }
        //swap(ints, low, j);
        return j;
    }

}