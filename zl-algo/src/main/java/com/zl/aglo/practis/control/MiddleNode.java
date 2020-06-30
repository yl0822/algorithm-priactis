/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis.control;

import com.zl.aglo.practis.base.Printer;
import com.zl.aglo.practis.base.model.ListNode;

/**
 * @author zhenlong
 * @version $Id: MiddleNode.java, v 0.1 2020年06月22日 12:58 PM zhenlong Exp $
 */
public class MiddleNode {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        ListNode head2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, null))))));
        ListNode head3 = new ListNode(1, null);
        Printer.printNode(middleNode(head3));
    }

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (true) {
            if (fast.next == null) {
                return slow;
            } else if (fast.next.next == null) {
                return slow.next;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
    }

    private static ListNode findMiddleElement(ListNode head) {

        // The pointer used to disconnect the left half from the mid node.
        //ListNode prevPtr = null;
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        // Iterate until fastPr doesn't reach the end of the linked list.
        while (fastPtr != null && fastPtr.next != null) {
            //prevPtr = slowPtr;
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        // Handling the case when slowPtr was equal to head.
        //if (prevPtr != null) {
        //    prevPtr.next = null;
        //}

        return slowPtr;
    }
}