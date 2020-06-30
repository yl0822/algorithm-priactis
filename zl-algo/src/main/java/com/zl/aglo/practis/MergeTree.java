/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

import com.zl.aglo.practis.base.TreeUtils;
import com.zl.aglo.practis.base.model.TreeNode;
import com.zl.aglo.practis.control.ThreeOrderTraversal;

/**
 * 617
 * @author zhenlong
 * @version $Id: MergeTree.java, val 0.1 2020年05月28日 6:42 PM zhenlong Exp $
 */
public class MergeTree {

    public static void main(String[] args) {
        TreeNode t1 = TreeUtils.convert(new Integer[]{1, 3,2, 5,null, null,null});
        TreeNode t2 = TreeUtils.convert(new Integer[]{2, 1,3, null,4, null,7});
        ThreeOrderTraversal.preTrvl(mergeTrees(t1, t2));
    }

    private static TreeNode mergeTrees(TreeNode t1, TreeNode t2){
        if (t1 == null){
            return t2;
        }
        if (t2 == null){
            return t1;
        }
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
}