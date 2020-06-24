/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

import com.algo.practis.base.model.MultiNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zhenlong
 * @version $Id: MultiNodePreorder.java, v 0.1 2020年06月01日 11:52 PM zhenlong Exp $
 */
public class MultiNodePreorder {

    public static void main(String[] args) {

    }

    private static List<Integer> preorder2(MultiNode root){
        List<Integer> list = new ArrayList<>();
        selfOrder(root, list);
        return list;
    }

    private static void selfOrder(MultiNode root, List<Integer> list){
        if (root == null){
            return;
        }
        list.add(root.val);
        if (root.children != null){
            for (MultiNode child : root.children) {
                selfOrder(child, list);
            }
        }
    }

    private static List<Integer> preorder(MultiNode root){
        List<Integer> list = new ArrayList<>();
        ArrayDeque<MultiNode> stack = new ArrayDeque<>();
        stack.push(root);
        while (!stack.isEmpty()){
            MultiNode node = stack.pop();
            list.add(node.val);
            if (node.children != null){
                for (MultiNode child : node.children) {
                    stack.push(child);
                }
            }
        }
        return list;
    }
}