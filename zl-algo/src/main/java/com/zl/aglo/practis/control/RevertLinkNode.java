/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis.control;

import com.zl.aglo.practis.base.Printer;
import com.zl.aglo.practis.base.model.ListNode;

import java.util.Stack;

/**
 *
 * @author zhenlong
 * @version $Id: RevertLinkNode.java, val 0.1 2020年05月27日 10:52 AM zhenlong Exp $
 */
public class RevertLinkNode {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        Printer.printNode((head));
        Printer.printNode(revertNode2(head));
    }


    private static ListNode revertNode(ListNode head) {
        // pre|cur双指针不断下探遍历，直到列尾
        ListNode pre = null;
        ListNode cur = head;
        // next这里只是用于单次循环的中间变量
        ListNode next;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    private static ListNode revertNode2(ListNode head){
        Stack<ListNode> stack = new Stack<>();
        while(head != null){
            stack.push(head);
            head = head.next;
        }
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while(!stack.isEmpty()){
            cur.next = new ListNode(stack.pop().val);
            cur = cur.next;
        }
        return dummyHead.next;
    }
}