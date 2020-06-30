/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

import com.zl.aglo.practis.base.TreeUtils;
import com.zl.aglo.practis.base.model.TreeNode;
import com.zl.aglo.practis.control.ThreeOrderTraversal;

/**
 * @author zhenlong
 * @version $Id: InvertTree.java, val 0.1 2020年05月28日 7:17 PM zhenlong Exp $
 */
public class InvertTree {

    public static void main(String[] args) {
        ThreeOrderTraversal.preTrvl(TreeUtils.convert(new Integer[] {4, 2, 7, 1, 3, 6, 9}));
        System.out.println();
        ThreeOrderTraversal.preTrvl(invertTree(TreeUtils.convert(new Integer[] {4, 2, 7, 1, 3, 6, 9})));
    }

    private static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}