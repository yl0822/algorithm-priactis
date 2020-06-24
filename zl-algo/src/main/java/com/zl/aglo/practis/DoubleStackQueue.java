/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

import java.util.Stack;

/**
 * @author zhenlong
 * @version $Id: DoubleStackQueue.java, v 0.1 2020年06月02日 8:41 PM zhenlong Exp $
 */
public class DoubleStackQueue {
    // 用于存储最先进入的对象
    private Stack<Integer> cur;
    // 用于按序存储剩余对象
    private Stack<Integer> store;

    public DoubleStackQueue() {
        cur = new Stack<>();
        store = new Stack<>();
    }

    public void push(int x) {
        if (cur.empty()) {
            cur.push(x);
        } else {
            store.push(x);
        }
    }

    public int pop() {
        Integer t = cur.pop();
        while (store.size() > 1) {
            cur.push(store.pop());
        }
        Stack<Integer> temp = cur;
        cur = store;
        store = temp;
        return t;
    }

    public int peek() {
        return cur.peek();
    }

    public boolean empty() {
        return cur.empty() && store.empty();
    }

    public static void main(String[] args) {
        DoubleStackQueue queue = new DoubleStackQueue();
        queue.push(1);
        queue.push(2);
        // 返回 1
        System.out.println(queue.peek());
        // 返回 1
        System.out.println(queue.pop());
        // 返回 false
        System.out.println(queue.empty());

        CQueue queue2 = new CQueue();
        queue2.appendTail(1);
        // 返回 1
        System.out.println(queue2.deleteHead());
    }

    static class CQueue {
        // 用于存储最先进入的对象
        private Stack<Integer> cur;
        // 用于按序存储剩余对象
        private Stack<Integer> store;
        public CQueue() {
            cur = new Stack<>();
            store = new Stack<>();
        }

        public void appendTail(int value) {
            if (cur.empty()) {
                cur.push(value);
            } else {
                store.push(value);
            }
        }

        public int deleteHead() {
            Integer t = cur.pop();
            while (store.size() > 1) {
                cur.push(store.pop());
            }
            Stack<Integer> temp = cur;
            cur = store;
            store = temp;
            return t;
        }
    }

}

