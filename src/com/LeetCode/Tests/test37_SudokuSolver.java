package com.LeetCode.Tests;

import com.LeetCodeJack.Problems.P37_SudokuSolver;

import java.util.Arrays;

public class test37_SudokuSolver {
    public static void main(String[] args) {
        P37_SudokuSolver tester = new P37_SudokuSolver();
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        tester.solveSudoku(board);
        for (char[] ch : board) {
            System.out.println(Arrays.toString(ch));
        }
    }
}
