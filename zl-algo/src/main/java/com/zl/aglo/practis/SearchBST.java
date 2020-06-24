/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

import com.algo.practis.base.model.TreeNode;

/**
 * lc - No.700
 *
 * @author zhenlong
 * @version $Id: SearchBST.java, val 0.1 2020年05月30日 9:22 PM zhenlong Exp $
 */
public class SearchBST {

    public static void main(String[] args) {
    }

    private static TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        if (root.val < val) {
            return searchBST(root.right, val);
        } else {
            return searchBST(root.left, val);
        }
    }

}