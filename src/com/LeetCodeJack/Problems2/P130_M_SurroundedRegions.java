package com.LeetCodeJack.Problems2;

import java.util.HashSet;
import java.util.Set;

public class P130_M_SurroundedRegions {
    int m;
    int n;

    public void solve(char[][] board) {
        if (board.length < 2 || board[0].length < 2)
            return;
        m = board.length;
        n = board[0].length;
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O')
                helperDFS(board, i, 0);
            if (board[i][n - 1] == 'O')
                helperDFS(board, i, n - 1);
        }
        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O')
                helperDFS(board, 0, j);
            if (board[m - 1][j] == 'O')
                helperDFS(board, m - 1, j);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'X')
                    continue;
                else if (board[i][j] == '*')
                    board[i][j] = 'O';
                else if (board[i][j] == 'O')
                    board[i][j] = 'X';
            }
        }
    }

    private void helperDFS(char[][] board, int i, int j) {
        if (i < 0 || i > m - 1 || j < 0 || j > n - 1)
            return;
        if (board[i][j] == 'O')
            board[i][j] = '*';
        if (i - 1 > 0 && board[i - 1][j] == 'O')
            helperDFS(board, i - 1, j);
        if (i + 1 < m - 1 && board[i + 1][j] == 'O')
            helperDFS(board, i + 1, j);
        if (j - 1 > 0 && board[i][j - 1] == 'O')
            helperDFS(board, i, j - 1);
        if (j + 1 < n - 1 && board[i][j + 1] == 'O')
            helperDFS(board, i, j + 1);
    }
}
