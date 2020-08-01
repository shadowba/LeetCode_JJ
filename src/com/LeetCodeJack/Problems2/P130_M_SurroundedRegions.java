package com.LeetCodeJack.Problems2;

import java.util.HashSet;
import java.util.Set;

public class P130_M_SurroundedRegions {
    int m;
    int n;
    Set<String> visited = new HashSet<>();
    public void solve(char[][] board) {
        m = board.length;
        n = board[0].length;

        for(int i = 1; i < m - 1; i++){
            for(int j = 1; j < n - 1;j++){
                helper(board, i, j);
            }
        }
    }
    private boolean helper(char[][] board, int i, int j){
        if(board[i][j] == 'X')
            return true;
        if((i==0||i==m-1||j==0||j==n-1)&&(board[i][j]=='O'))
            return false;

        if(board[i-1][j] == 'O') {
            res &= helper(board, i - 1, j);
        }
        if(board[i+1][j] == 'O') {
            res &= helper(board, i + 1, j);
        }
        if(board[i][j-1] == 'O') {
            res &= helper(board, i, j-1);
        }
        if(board[i][j+1] == 'O') {
            res &= helper(board, i , j+1);
        }
        return res;
    }
}
