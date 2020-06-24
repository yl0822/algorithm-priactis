/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis.base.model;

/**
 *
 * @author zhenlong
 * @version $Id: ListNode.java, val 0.1 2020年05月27日 9:47 AM zhenlong Exp $
 */
public class DoubleNode {
    public String        val;
    public DoubleNode pre;
    public DoubleNode next;

    public DoubleNode(String val, DoubleNode pre, DoubleNode next) {
        this.val = val;
        this.pre = pre;
        this.next = next;
    }

    public DoubleNode(String val) {
        this.val = val;
    }
}