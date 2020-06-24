/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis.base;

import com.algo.practis.base.model.ListNode;

import java.util.Arrays;

/**
 *
 * @author zhenlong
 * @version $Id: Printer.java, val 0.1 2020年05月27日 9:46 AM zhenlong Exp $
 */
public class Printer {

    public static void printNode(ListNode head){
        while (head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void printArray(int[] ints){
        Arrays.stream(ints).forEach(value -> System.out.print(value + ", "));
        System.out.println();
    }

    public static void printArray(int[][] ints){
        for (int i = 0; i < ints.length; i++) {
            printArray(ints[i]);
        }
    }
}