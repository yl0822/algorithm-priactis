/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis.control;

import com.zl.aglo.practis.base.model.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static com.zl.aglo.practis.base.TreeUtils.COMMON_TREE;

/**
 * @author zhenlong
 * @version $Id: ThreeOrderTraversal.java, val 0.1 2020年05月27日 10:51 AM zhenlong Exp $
 */
public class ThreeOrderTraversal {


    public static void main(String[] args) {
        preTrvl(COMMON_TREE);
        //preorderTraversal(COMMON_TREE).forEach(integer -> System.out.print(integer + ", "));
    }

    public static void preTrvl(TreeNode root) {
        if (root == null) {
            return;
        }
        preTrvl(root.left);
        System.out.print(root.val + ", ");
        preTrvl(root.right);
    }

    private static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            res.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }

        }
        return res;
    }
}