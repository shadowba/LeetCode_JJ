package com.LeetCodeJack.Problems2;

import java.util.*;

public class P79_M_WordSearch {
    String target;
    int m;
    int n;
    boolean[][] visited;


    public boolean exist(char[][] board, String word) {
        target = word;
        m = board.length;
        n = board[0].length;
        visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == target.charAt(0)) {
                    if(helperDfs(board, i, j, 0))
                        return true;
                }
            }
        }
        return false;
    }

    private boolean helperDfs(char[][] board, int i, int j, int idx) {
        if (idx == target.length())
            return true;
        if (i < 0 || i > m - 1 || j < 0 || j > n - 1 || board[i][j] != target.charAt(idx) || visited[i][j])
            return false;

        visited[i][j] = true;
        if (helperDfs(board, i + 1, j, idx + 1) || helperDfs(board, i - 1, j, idx + 1)
                || helperDfs(board, i, j + 1, idx + 1) || helperDfs(board, i, j - 1, idx + 1))
            return true;
        visited[i][j] = false;
        return false;
    }
}
//  DFS 方法 但是 Over Time Limit

//    String target;
//    boolean res;
//    int m;
//    int n;
//    boolean[] visited;
//    int Index;
//
//    public boolean exist(char[][] board, String word) {
//        target = word;
//        res = false;
//        m = board.length;
//        n = board[0].length;
//        visited = new boolean[m * n];
//        Index = 0;
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (board[i][j] == target.charAt(0)) {
//                    helperDfs(board, i, j);
//
//                    visited[i * n + j] = false;
//                    Index--;
//                }
//            }
//        }
//        return res;
//    }
//
//    private void helperDfs(char[][] board, int i, int j) {
//        visited[i * n + j] = true;
//        Index++;
//        if (target.charAt(Index - 1) == board[i][j]) {
//            if (Index == target.length()) {
//                res = true;
//                return;
//            }
//            if (i - 1 >= 0 && visited[(i - 1) * n + j] == false && target.charAt(Index) == board[i - 1][j]) {
//                helperDfs(board, i - 1, j);
//
//                visited[(i - 1) * n + j] = false;
//                Index--;
//            }
//            if (j - 1 >= 0 && visited[i * n + j - 1] == false && target.charAt(Index) == board[i][j - 1]) {
//                helperDfs(board, i, j - 1);
//
//                visited[i * n + j - 1] = false;
//                Index--;
//            }
//            if (i + 1 <= m - 1 && visited[(i + 1) * n + j] == false && target.charAt(Index) == board[i + 1][j]) {
//                helperDfs(board, i + 1, j);
//
//                visited[(i + 1) * n + j] = false;
//                Index--;
//            }
//            if (j + 1 <= n - 1 && visited[i * n + j + 1] == false && target.charAt(Index) == board[i][j + 1]) {
//                helperDfs(board, i, j + 1);
//
//                visited[i * n + j + 1] = false;
//                Index--;
//            }
//        } else {
//            return;
//        }
//    }
