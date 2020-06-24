/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis.control;

import com.algo.practis.base.model.TreeNode;

/**
 *
 * @author zhenlong
 * @version $Id: SortedArrayToBST.java, v 0.1 2020年06月21日 10:58 AM zhenlong Exp $
 */
public class SortedArrayToBST {

    public static void main(String[] args) {
        ThreeOrderTraversal.preTrvl(sortedArrayToBST(new int[]{-10,-3,0,5,9}, 0, 4));
    }

    private static TreeNode sortedArrayToBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        // always choose left middle node as a root
        int p = (left + right) / 2;

        // inorder traversal: left -> node -> right
        TreeNode root = new TreeNode(nums[p]);
        root.left = sortedArrayToBST(nums, left, p - 1);
        root.right = sortedArrayToBST(nums, p + 1, right);
        return root;
    }
}