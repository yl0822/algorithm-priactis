/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

import java.util.Stack;

/**
 *
 * @author zhenlong
 * @version $Id: SortArrayByParityII.java, val 0.1 2020年05月10日 12:57 PM zhenlong Exp $
 */
public class SortArrayByParityII {
    public static int[] sortArrayByParityII(int[] A) {
        Stack<Integer> odd = new Stack<>();
        Stack<Integer> even = new Stack<>();
        int t = 0;
        for (int i = 0; i < A.length; i++) {
            if (i % 2 == 0 && A[i] % 2 == 0){
                continue;
            }
            if (i % 2 != 0 && A[i] % 2 != 0){
                continue;
            }
            // 偶数放在了奇数位上
            if (i % 2 == 0 && A[i] % 2 != 0){
                odd.push(i);
            }
            // 奇数放在了偶数位上
            if (i % 2 != 0 && A[i] % 2 == 0){
                even.push(i);
            }
        }
        while (!odd.empty()){
            int o = odd.pop();
            int e = even.pop();
            int temp = A[o];
            A[o] = A[e];
            A[e] = temp;
        }
        return A;
    }
}