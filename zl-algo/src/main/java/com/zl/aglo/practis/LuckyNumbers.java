/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author zhenlong
 * @version $Id: LuckyNumbers.java, v 0.1 2020年06月23日 11:20 AM zhenlong Exp $
 */
public class LuckyNumbers {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(luckyNumbers(new int[][]{{3,7,8},{9,11,13},{15,16,17}}).toArray()));
    }
    private static List<Integer> luckyNumbers(int[][] matrix){
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> rowMin = new HashMap<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = 100000;
            for (int j = 0; j < matrix[i].length; j++) {
                int n = matrix[i][j];
                min = Math.min(min, n);
            }
            rowMin.put(i, min);
        }
        Map<Integer, Integer> colMax = new HashMap<>();
        for (int i = 0; i < matrix[0].length; i++) {
            int max = 0;
            for (int j = 0; j < matrix.length; j++) {
                int n = matrix[j][i];
                max = Math.max(max, n);
            }
            colMax.put(i, max);
        }
        for (Integer integer : rowMin.keySet()) {
            for (Integer integer1 : colMax.keySet()) {
                if (rowMin.get(integer).intValue() == colMax.get(integer1).intValue()){
                    list.add(colMax.get(integer1));
                }
            }
        }
        return list;
    }
}