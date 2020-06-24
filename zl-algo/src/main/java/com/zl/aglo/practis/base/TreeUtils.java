/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis.base;

import com.algo.practis.base.model.TreeNode;
import com.algo.practis.control.ThreeOrderTraversal;

/**
 * @author zhenlong
 * @version $Id: TreeUtils.java, val 0.1 2020年05月28日 6:06 PM zhenlong Exp $
 */
public class TreeUtils {

    /*
     *                        1
     *                   /        \
     *                 2           3
     *               /  \        /   \
     *             4     5      6     7
     *            / \   / \    / \   / \
     *           8   9 10  11 12 13  14 15
     *                /     \
     *               16     17
     */
    public static TreeNode COMMON_TREE = new TreeNode(1,
            new TreeNode(2,
                    new TreeNode(4,
                            new TreeNode(8), new TreeNode(9)),
                    new TreeNode(5,
                            new TreeNode(10,
                                    new TreeNode(16), null),
                            new TreeNode(11,
                                    null, new TreeNode(17)))),
            new TreeNode(3,
                    new TreeNode(6,
                            new TreeNode(12), new TreeNode(13)),
                    new TreeNode(7,
                            new TreeNode(14), new TreeNode(15))));

    public static void main(String[] args) {
        Integer[] integers = new Integer[]{
                                                     1,
                                   2,                                  3,
                          4,                5,                6,                 7,
                     8,       9,      10,       11,     12,       13,       14,      15,
                null,null,null,null,16,null,null,17,null,null,null,null,null,null,null,null};
        ThreeOrderTraversal.preTrvl(convert(integers));
    }

    public static TreeNode convert(Integer[] array) {
        int floor = 0, count = 0;
        TreeNode[] treeNodes = new TreeNode[array.length];
        while (array != null && count < array.length) {
            int start = (int) Math.pow(2, floor) - 1;
            int end = (int) Math.pow(2, floor + 1) - 1;
            if (end > array.length) {
                end = array.length;
            }
            for (int i = start; i < end; i++) {
                if (array[i] != null) {
                    treeNodes[i] = new TreeNode(array[i]);
                } else {
                    treeNodes[i] = null;
                }
                if (i > 0) {
                    int parent = (i - 1) / 2;
                    if (parent >= 0) {
                        TreeNode pNode = treeNodes[parent];
                        if (pNode != null) {
                            if (i % 2 == 1) {
                                pNode.left = treeNodes[i];
                            } else {
                                pNode.right = treeNodes[i];
                            }
                        }
                    }
                }
                count++;
            }
            floor++;
        }
        return treeNodes[0];
    }
}