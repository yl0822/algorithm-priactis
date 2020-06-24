/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

import java.util.Arrays;

/**
 *
 * @author zhenlong
 * @version $Id: FindPostiveNum.java, v 0.1 2020年06月03日 8:59 PM zhenlong Exp $
 */
public class FindPostiveNum {

    public static void main(String[] args) {
        System.out.println(findNum(new int[]{-8, -2, -2}));
    }

    private static int findNum(int[] ints){
        Arrays.sort(ints);
        int n = ints.length;
        int i = 0;
        for(;i < n ;i++){
            if(ints[i] <= 0){
                continue;
            }
            break;
        }
        int j = 1;
        for(; i < n ;i++){
            if(ints[i] != j){
                break;
            }
            if(ints[i - 1] != ints[i]){
                j++;
            }
        }
        return j;
    }

}