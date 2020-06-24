/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author zhenlong
 * @version $Id: KClosest.java, val 0.1 2020年05月09日 11:52 PM zhenlong Exp $
 */
public class KClosest {

    static class Pair{
        private double l;
        private int r;

        public Pair(double l, int r) {
            this.l = l;
            this.r = r;
        }
    }


    public static int[][] kClosest(int[][] points, int K) {
        int[][] ret = new int[K][2];
        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.l - o2.l > 0 ? 1:0;
            }
        });
        for (int i = 0; i < points.length; i++) {
            priorityQueue.add(new Pair(Math.sqrt(Math.pow(points[i][0], 2) +
                    Math.pow(points[i][1], 2)), i));
        }
        for (int i = 0; i < K; i++) {
            ret[i] = points[priorityQueue.poll().r];
        }
        return ret;

    }

    public static void main(String[] args) {
        for (int[] ints : kClosest(new int[][] {{0,1}, {1, 0}}, 2)) {
            for (int anInt : ints) {
                System.out.print(anInt+", ");
            }
            System.out.println();
        }
    }
}