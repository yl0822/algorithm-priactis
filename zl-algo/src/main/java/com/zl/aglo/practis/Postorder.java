/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

import com.algo.practis.base.model.MultiNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author zhenlong
 * @version $Id: Postorder.java, val 0.1 2020年05月30日 8:52 PM zhenlong Exp $
 */
public class Postorder {

    public static void main(String[] args) {
        MultiNode root = new MultiNode(1, Arrays.asList(
                new MultiNode(3,
                        Arrays.asList(new MultiNode(5, null),
                        new MultiNode(6, null))),
                new MultiNode(2, null),
                new MultiNode(4, null)));
        postorder(root).forEach(System.out::println);
    }

    private static void post(MultiNode root, List<Integer> list){
        if (root == null){
            return;
        }
        if (root.children == null){
            list.add(root.val);
            return;
        }
        for (MultiNode child : root.children) {
            post(child, list);
        }
        list.add(root.val);
    }

    private static List<Integer> postorder(MultiNode root){
        List<Integer> list = new ArrayList<>();
        post(root, list);
        return list;
    }
}