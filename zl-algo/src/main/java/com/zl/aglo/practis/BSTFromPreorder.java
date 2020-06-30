/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

import com.zl.aglo.practis.base.model.TreeNode;

/**
 *
 * @author zhenlong
 * @version $Id: BSTFromPreorder.java, v 0.1 2020年06月24日 10:36 AM zhenlong Exp $
 */
public class BSTFromPreorder {

    public static void main(String[] args) {
        TreeNode ret = bstFromPreorder(new int[]{8,5,1,7,10,12});
        System.out.println(ret.val);

    }

    private static TreeNode bstFromPreorder(int[] preorder){
        TreeNode treeNode = new TreeNode(-1);
        for (int i : preorder) {
            addTreeNode(treeNode, i);
        }
        return treeNode.left;
    }

    private static void addTreeNode(TreeNode root, int data) {
        TreeNode node = new TreeNode(data);
        TreeNode p = root;
        while (true) {
            if (p.val == -1){
                p.left = node;
                p = p.left;
                continue;
            }
            //如果要插入的结点data比结点p的值小，就往p结点的左
            //子节点找，否则往p的右子节点找
            if (p.val > data) {
                //如果p的左子节点等于空，直接放进去
                if (p.left == null) {
                    p.left = node;
                    break;
                } else {
                    p = p.left;
                }
            } else {
                //如果p的右子节点等于空，直接放进去
                if (p.right == null) {
                    p.right = node;
                    break;
                } else {
                    p = p.right;
                }
            }
        }
    }
}