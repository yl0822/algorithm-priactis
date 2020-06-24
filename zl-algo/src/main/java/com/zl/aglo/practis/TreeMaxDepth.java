/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

import com.algo.practis.base.model.TreeNode;

import static com.algo.practis.base.TreeUtils.COMMON_TREE;

/**
 *
 * @author zhenlong
 * @version $Id: TreeMaxDepth.java, v 0.1 2020年06月01日 11:33 PM zhenlong Exp $
 */
public class TreeMaxDepth {
    public static void main(String[] args) {
        System.out.println(maxDepth(COMMON_TREE));
    }

    private static int maxDepth(TreeNode root){
        if (root == null){
            return 0;
        }else {
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    }
}