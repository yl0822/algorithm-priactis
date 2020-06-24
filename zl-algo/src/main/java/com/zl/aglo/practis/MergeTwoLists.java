/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

import com.algo.practis.base.model.ListNode;

/**
 * lc-No.25
 * @author zhenlong
 * @version $Id: MergeTwoLists.java, val 0.1 2020年05月19日 5:38 PM zhenlong Exp $
 */
public class MergeTwoLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode ret = mergeTwoLists(l1, l2);
        while (ret != null) {
            System.out.println(ret.val);
            ret = ret.next;
        }
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }
        while (l1 != null && l2 != null){
            if (l1.val <= l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if (l1 == null){
            cur.next = l2;
        }else {
            cur.next = l1;
        }
        return dummyHead.next;
    }
}