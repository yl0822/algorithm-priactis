/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

import com.algo.practis.base.Printer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zhenlong
 * @version $Id: GameOfLife.java, v 0.1 2020年06月22日 7:46 PM zhenlong Exp $
 */
public class GameOfLife {

    public static void main(String[] args) {
        int[][] board = new int[][]{{0,1,0}, {0,0,1}, {1,1,1}, {0,0,0}};
        Printer.printArray(board);
        System.out.println();
        gameOfLife(board);
        Printer.printArray(board);
    }


    private static void gameOfLife(int[][] board){
        List<String> updater = new ArrayList<>();
        int r = board.length;
        int c = board[0].length;
        for (int i = 0; i < board.length; i++) {
            for (int k = 0; k < board[i].length; k++) {
                List<Integer> list = new ArrayList<>();
                int leftup = (i == 0 || k == 0) ? -1 : board[i - 1][k - 1];
                if (leftup >= 0){
                    list.add(leftup);
                }
                int up = (i == 0 ) ?  -1 : board[i - 1][k];
                if (up >= 0){
                    list.add(up);
                }
                int rightup = (i == 0 || k == c - 1) ?  -1 : board[i - 1][k + 1];
                if (rightup >= 0){
                    list.add(rightup);
                }
                int left = (k == 0) ?  -1 : board[i][k - 1];
                if (left >= 0){
                    list.add(left);
                }
                int right = (k == c - 1) ?  -1 : board[i][k + 1];
                if (right >= 0){
                    list.add(right);
                }
                int leftdown = (i == r -1 || k == 0) ?  -1 : board[i + 1][k - 1];
                if (leftdown >= 0){
                    list.add(leftdown);
                }
                int down = (i == r - 1) ?  -1 : board[i + 1][k];
                if (down >= 0){
                    list.add(down);
                }
                int rightdown = (i == r-1 || k == c-1) ?  -1 : board[i + 1][k + 1];
                if (rightdown >= 0){
                    list.add(rightdown);
                }
                int cnt = 0;
                for (Integer integer : list) {
                    cnt += integer;
                }
                if (board[i][k] == 1 && cnt < 2){
                    updater.add(i+"_"+k+"_0");
                }
                if (board[i][k] == 0 && cnt == 3){
                    updater.add(i+"_"+k+"_1");
                }
                if (board[i][k] == 1 && cnt > 3){
                    updater.add(i+"_"+k+"_0");
                }
            }
        }
        for (String s : updater) {
            board[Integer.valueOf(s.split("_")[0])][Integer.valueOf(s.split("_")[1])] = Integer.valueOf(s.split("_")[2]);
        }
    }
}