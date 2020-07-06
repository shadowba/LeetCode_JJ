package com.LeetCodeJack.Problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class P36_ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        boolean goodRows = isValidRows(board);
        boolean goodCols = isValidCols(board);
        boolean goodSubs = isValidSubBoards(board);
//        System.out.println(goodRows + ", " + goodCols+ ", " + goodSubs);
        return goodRows && goodCols && goodSubs;
    }

    private boolean isValidRows(char[][] board) {
        Set<Character> visited = new HashSet<>();
        for (char[] row : board) {
            visited.clear();
            for (char item : row) {
                if (item == '.')
                    continue;
                if (!visited.contains(item))
                    visited.add(item);
                else
                    return false;
            }
        }
        return true;
    }

    private boolean isValidCols(char[][] board) {
        Set<Character> visited = new HashSet<>();
        for (int col = 0; col < 9; col++) {
            visited.clear();
            for (int row = 0; row < 9; row++) {
                if (board[row][col] == '.')
                    continue;
                if (!visited.contains(board[row][col]))
                    visited.add(board[row][col]);
                else
                    return false;
            }
        }
        return true;
    }

    private boolean isValidSubBoards(char[][] board) {
        Set<Character> visited = new HashSet<>();
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                visited.clear();
                for (int m = 0; m < 3; m++) {
                    for (int n = 0; n < 3; n++) {
                        if (board[i + m][j + n] == '.')
                            continue;
                        if (!visited.contains(board[i + m][j + n]))
                            visited.add(board[i + m][j + n]);
                        else
                            return false;
                    }
                }
            }
        }
        return true;
    }
}
