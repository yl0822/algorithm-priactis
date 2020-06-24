/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

/**
 *
 * @author zhenlong
 * @version $Id: CustomStack.java, v 0.1 2020年06月24日 9:51 AM zhenlong Exp $
 */
public class CustomStack {

    private int[] holder;
    private int maxSize;
    private int used;

    public CustomStack(int maxSize){
        this.maxSize = maxSize;
        this.used = 0;
        holder = new int[maxSize];
    }

    public void push(int x){
        if (used >= maxSize){
            return;
        }
        holder[used++] = x;
    }

    public int pop(){
        if (used == 0){
            return -1;
        }
        return holder[--used];
    }

    public void increment(int k, int val){
        for (int i = 0; i < Math.min(k, used); i++) {
            holder[i] += val;
        }
    }
}