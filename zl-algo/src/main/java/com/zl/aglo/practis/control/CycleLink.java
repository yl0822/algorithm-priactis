/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis.control;

import com.algo.practis.base.model.ListNode;

/**
 *
 * @author zhenlong
 * @version $Id: CycleLink.java, val 0.1 2020年05月30日 10:32 PM zhenlong Exp $
 */
public class CycleLink {

    public static void main(String[] args) {

    }

    private static boolean hasCycle(ListNode head){
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    private static boolean p_2020_06_01(ListNode head){
        if (head == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != null && fast != null){
            if (slow == fast){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}