/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author zhenlong
 * @version $Id: ShortestSubarray.java, val 0.1 2020年05月10日 12:20 PM zhenlong Exp $
 */
public class ShortestSubarray {

    public static int shortestSubarray(int[] A, int K) {
        for (int i = 1; i <= A.length; i++) {
            for (int j = 0; j <= A.length - i; j++) {
                int t = i;
                int sum = 0;
                while (t-- > 0){
                    sum += A[j + t];
                }
                if (sum >= K){
                    return i;
                }
            }
        }
        return -1;
    }

    public static int shortestSubarray2(int[] A, int K) {
        List<Integer> list= new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 1; j <= A.length - i; j++) {
                int sum = 0;
                int t = j;
                while (t-- > 0){
                    sum += A[i + t];
                }
                if (sum >= K){
                    list.add(j);
                }
            }
        }
        if (list.size() > 0){
            Collections.sort(list);
            return list.get(0);
        }
        return -1;
    }

    public static void main(String[] args) {
        //System.out.println(shortestSubarray2(new int[]{48,99,37,4,-31}, 140));
        System.out.println(shortestSubarray2(new int[]{17,85,93,-45,-21}, 150));
        System.out.println(shortestSubarray(new int[]{2,-1,2}, 3));
    }
}