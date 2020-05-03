/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.topic1.cap3;

import java.util.Iterator;

/**
 *
 * @author zhenlong
 * @version $Id: 基于数组实现的常用数据结构.java, v 0.1 2020年05月03日 4:57 PM zhenlong Exp $
 */
public class 基于数组实现的常用数据结构 {

    public static void main(String[] args) {
        //ArrayBasedBag<String> arrayBasedBag = new ArrayBasedBag<>(3);
        //arrayBasedBag.add("aaa");
        //arrayBasedBag.add("bbb");
        //arrayBasedBag.add("ccc");
        //arrayBasedBag.add("ccc");
        //for (Object o : arrayBasedBag) {
        //    System.out.println(o);
        //}

        ArrayBasedStack<String> arrayBasedStack = new ArrayBasedStack<>(3);
        arrayBasedStack.push("aaa");
        arrayBasedStack.push("bbb");
        arrayBasedStack.push("ccc");
        arrayBasedStack.push("ddd");
        arrayBasedStack.push("eee");
        while (true){
            System.out.println(arrayBasedStack.pop());
        }

        //ArrayBasedQueue<String> arrayBasedQueue = new ArrayBasedQueue<>(3);
        //arrayBasedQueue.push("aaa");
        //arrayBasedQueue.push("bbb");
        //arrayBasedQueue.push("ccc");
        //arrayBasedQueue.push("ddd");
        //arrayBasedQueue.push("eee");
        //while (true){
        //    System.out.println(arrayBasedQueue.pop());
        //}
    }

    static class ArrayBasedQueue<T> implements Stack, CachedSize, Iterable{
        private int size;

        private int index;

        private Object[] container;

        public ArrayBasedQueue(int size) {
            this.size = 0;
            this.index = 0;
            this.container = new Object[size];
        }

        @Override
        public int size() {
            return size;
        }

        @Override
        public void push(Object element) {
            if (size >= container.length){
                resize();
            }
            this.container[size++] = element;
        }

        private void resize(){
            Object[] newContainer = new Object[size * 2];
            System.arraycopy(container, 0, newContainer, 0, size);
            this.container = newContainer;
        }

        @Override
        @SuppressWarnings("unchecked")
        public T pop() {
            if (size == 0){
                throw new RuntimeException("queue is empty");
            }
            Object o = this.container[index];
            this.container[index++] = null;
            size--;
            return (T)o;
        }

        @Override
        public Iterator<T> iterator() {
            return new Iterator<T>() {

                int i = 0;

                @Override
                public boolean hasNext() {
                    return i < size;
                }

                @Override
                @SuppressWarnings("unchecked")
                public T next() {
                    return (T)container[i++];
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

    static class ArrayBasedStack<T> implements Stack, CachedSize, Iterable{

        private int size;

        private Object[] container;

        public ArrayBasedStack(int size) {
            this.size = 0;
            this.container = new Object[size];
        }

        @Override
        public int size() {
            return size;
        }

        @Override
        public void push(Object element) {
            if (size >= container.length){
                resize();
            }
            this.container[size++] = element;
        }

        private void resize(){
            Object[] newContainer = new Object[size * 2];
            System.arraycopy(container, 0, newContainer, 0, size);
            this.container = newContainer;
        }

        @Override
        @SuppressWarnings("unchecked")
        public T pop() {
            if (size == 0){
                throw new RuntimeException("stack is empty");
            }
            Object o = this.container[--size];
            this.container[size] = null;
            return (T)o;
        }

        @Override
        public Iterator<T> iterator() {
            return new Iterator<T>() {

                int i = 0;

                @Override
                public boolean hasNext() {
                    return i < size;
                }

                @Override
                @SuppressWarnings("unchecked")
                public T next() {
                    return (T)container[i++];
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

    static class ArrayBasedBag<T> implements Bag, FixedSize, Iterable{

        private int size;

        private Object[] container;

        public ArrayBasedBag(int size) {
            this.container = new Object[size];
        }

        @Override
        public void add(Object element) {
            if (isFull()){
                throw new RuntimeException("bag is full");
            }
            container[size++] = element;
        }

        @Override
        public boolean isEmpty() {
            return container.length == 0;
        }

        @Override
        public boolean isFull() {
            return container.length <= size;
        }

        @Override
        public Iterator<T> iterator() {
            return new Iterator<T>() {

                int i = 0;

                @Override
                public boolean hasNext() {
                    return i < size;
                }

                @Override
                @SuppressWarnings("unchecked")
                public T next() {
                    return (T)container[i++];
                }
            };
        }
    }

    /**
     * bag数据结构
     * 1. 只增加不删除
     * 2. 可遍历
     */
    public interface Bag<T>{

        void add(T element);
    }

    public interface FixedSize{

        boolean isEmpty();

        boolean isFull();

    }

    public interface CachedSize{

        int size();
    }

    /**
     * stack数据结构
     * 1. FIFO
     * 2. 可遍历
     */
    public interface Stack<T>{

        void push(T element);

        T pop();

    }

    /**
     * queue数据结构
     * 1. LIFO
     * 2. 可遍历
     */
    public interface Queue<T>{

        void push(T element);

        T pop();

    }
}