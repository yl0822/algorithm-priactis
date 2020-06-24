/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

/**
 *
 * @author zhenlong
 * @version $Id: ContainsNearbyAlmostDuplicate.java, val 0.1 2020年05月09日 10:30 PM zhenlong Exp $
 */
public class ContainsNearbyAlmostDuplicate {

    public static void main(String[] args) {
        System.out.println(containsNearbyAlmostDuplicate(new int[]{1, 2, 3, 1}, 3, 0));
        System.out.println(containsNearbyAlmostDuplicate(new int[]{1, 0, 1, 1}, 1, 2));
        System.out.println(containsNearbyAlmostDuplicate(new int[]{1, 5,9,1,5,9}, 2, 3));

    }

    private static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (k == 0){
            return false;
        }
        for (int j = 1; j < k; j++) {
            for (int i = 0; i < nums.length - j - 1; i++) {
                if (Math.abs(nums[i] - nums[i + j]) > t) {
                    return false;
                }
            }
        }
        return true;
    }
}