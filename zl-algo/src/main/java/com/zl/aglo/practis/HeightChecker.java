/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

import java.util.Arrays;

/**
 * lc - no.1051
 * @author zhenlong
 * @version $Id: HeightChecker.java, val 0.1 2020年05月30日 9:36 PM zhenlong Exp $
 */
public class HeightChecker {

    private static int heightChecker(int[] heights){
        int n = heights.length;
        int[] origin = Arrays.copyOf(heights, n);
        int cnt = 0;
        Arrays.sort(heights);
        for (int i = 0; i < n - 1; i++) {
            if (origin[i] != heights[i]){
                cnt++;
            }
        }
        return cnt;
    }
}