/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.topic1.cap3;

import java.util.Iterator;

/**
 *
 * @author zhenlong
 * @version $Id: 基于链表实现的常用数据结构.java, v 0.1 2020年05月03日 4:57 PM zhenlong Exp $
 */
public class 基于链表实现的常用数据结构 {

    public static void main(String[] args) {
        //NodeBasedBag<String> nodeBasedBag = new NodeBasedBag<>();
        //nodeBasedBag.add("aaa");
        //nodeBasedBag.add("bbb");
        //nodeBasedBag.add("ccc");
        //nodeBasedBag.add("ddd");
        //for (Object o : nodeBasedBag) {
        //    System.out.println(o);
        //}

        //NodeBasedStack<String> nodeBasedStack = new NodeBasedStack<>();
        //nodeBasedStack.push("aaa");
        //nodeBasedStack.push("bbb");
        //nodeBasedStack.push("ccc");
        //nodeBasedStack.push("ddd");
        //nodeBasedStack.push("eee");
        //while (true){
        //    System.out.println(nodeBasedStack.pop());
        //}

        NodeBasedQueue<String> nodeBasedQueue = new NodeBasedQueue<>();
        nodeBasedQueue.push("aaa");
        nodeBasedQueue.push("bbb");
        nodeBasedQueue.push("ccc");
        nodeBasedQueue.push("ddd");
        nodeBasedQueue.push("eee");
        while (true){
            System.out.println(nodeBasedQueue.pop());
        }
    }

    static class NodeBasedQueue<T> implements 基于数组实现的常用数据结构.Stack,
            基于数组实现的常用数据结构.CachedSize, Iterable {

        private int size;

        private Node<T> head;

        private Node<T> tail;

        @Override
        public int size() {
            return size;
        }

        @Override
        public void push(Object element) {
            Node node = new Node(element);
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            size++;
        }

        @Override
        public T pop() {
            if (head == null){
                throw new RuntimeException("stack is empty");
            }
            Object temp = head.value;
            head = head.next;
            return (T)temp;
        }


        @Override
        public Iterator iterator() {
            return new Iterator<T>() {

                private Node<T> t = head;

                @Override
                public boolean hasNext() {
                    return t != null;
                }

                @Override
                public T next() {
                    T temp = t.value;
                    t = t.next;
                    return temp;
                }
            };
        }
    }

    static class NodeBasedStack<T> implements 基于数组实现的常用数据结构.Stack,
            基于数组实现的常用数据结构.CachedSize, Iterable {

        private int size;

        private Node<T> head;

        @Override
        public int size() {
            return size;
        }

        @Override
        public void push(Object element) {
            Node<T> temp = head;
            head = new Node(element);
            head.next = temp;
            size++;
        }

        @Override
        public T pop() {
            if (head == null){
                throw new RuntimeException("stack is empty");
            }
            Object temp = head.value;
            head = head.next;
            return (T)temp;
        }

        @Override
        public Iterator iterator() {
            return new Iterator<T>() {

                private Node<T> t = head;

                @Override
                public boolean hasNext() {
                    return t != null;
                }

                @Override
                public T next() {
                    T temp = t.value;
                    t = t.next;
                    return temp;
                }
            };
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (Object o : this) {
                sb.append(o).append(" ");
            }
            return sb.toString();
        }
    }


    static class NodeBasedBag<T> implements 基于数组实现的常用数据结构.Bag,
            基于数组实现的常用数据结构.CachedSize, Iterable{

        private int size;

        private Node<T> first;

        @Override
        public void add(Object element) {
            Node<T> temp = first;
            first = new Node(element);
            first.next = temp;
            size++;
        }

        @Override
        public int size() {
            return size;
        }

        @Override
        public Iterator<T> iterator() {
            return new Iterator<T>() {

                private Node<T> t = first;

                @Override
                public boolean hasNext() {
                    return t != null;
                }

                @Override
                public T next() {
                    T temp = t.value;
                    t = t.next;
                    return temp;
                }
            };
        }
    }

    static class LinkedList<T>{
        private Node<T> first;
        private Node<T> last;

        public void add(T t){
            final Node<T> l = last;
            final Node<T> newNode = new Node<>(t);
            last = newNode;
            if (l == null)
                first = newNode;
            else
                l.next = newNode;
        }

        @Override
        public String toString() {
            Node t = first;
            StringBuilder sb = new StringBuilder();
            while (t != null){
                sb.append(",value="+t.value);
                t = t.next;
            }
            return sb.toString();
        }

        public static void main(String[] args) {
            LinkedList<String> linkedList = new LinkedList<>();
            linkedList.add("1");
            linkedList.add("2");
            linkedList.add("3");
            linkedList.add("4");
            linkedList.add("5");
            System.out.println(linkedList);
            linkedList.revert();
            System.out.println(linkedList);
        }

        public void revert(){
            Node pre = null;
            Node cursor = first;
            while (cursor != null){
                Node next = cursor.next;
                cursor.next = pre;
                pre = cursor;
                cursor = next;
            }
            first = pre;
        }
    }

    static class Node<T>{
        private T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
        }

        @Override
        public String toString() {

            StringBuilder sb = new StringBuilder();
            Node cur = this;
            while (cur != null){
                sb.append(",value="+value);
                cur = next;
            }
            return sb.toString();
        }
    }
}