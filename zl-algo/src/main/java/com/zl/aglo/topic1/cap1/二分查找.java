/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.topic1.cap1;

import static com.zl.aglo.Builder.buildArray;
import static com.zl.aglo.Printer.printArray;
import static com.zl.aglo.topic1.cap2.排序算法.bubbleSort;

/**
 *
 * @author zhenlong
 * @version $Id: 二分查找.java, v 0.1 2020年05月02日 1:44 PM zhenlong Exp $
 */
public class 二分查找 {

    public static void main(String[] args) {
        // 假设数组元素各不相同
        //System.out.println(traverseSearch(10, buildArray(100)));
        //System.out.println(traverseSearch(10, buildArray(100)));
        //System.out.println(binarySearch(10, buildArray(100)));
        //printArray(distinct(buildArray(100)));

    }

    private static int traverseSearch(int key, int[] ints){
        // 优点在无需排序，缺点在最差情况下需要遍历整个数组
        for (int i = 0; i < ints.length; i++) {
            if (key == ints[i]){
                return i;
            }
        }
        return -1;
    }

    private static int binarySearch(int key, int[] ints){
        // 二分查查找的前置要求是有序
        ints = bubbleSort(ints);
        int low = 0;
        int high = ints.length;
        while (low <= high){
            System.out.println("low="+low+",high="+high);
            int mid = low + (high - low) / 2;
            if (key < ints[mid]){
                high = mid - 1;
            }else if (key >  ints[mid]){
                low = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}