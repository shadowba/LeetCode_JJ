package com.LeetCodeJack.Problems;

public class P37_SudokuSolver {
    public void solveSudoku(char[][] board) {
        if (board == null || board.length != 9 || board[0].length != 9) return;
        boolean res = sudokuSolver(board, 0, 0);
    }

    private boolean sudokuSolver(char[][] board, int row, int col) {
        if (board == null || board.length != 9 || board[0].length != 9) return false;

        while (row < 9 && col < 9) {
            if (board[row][col] == '.')
                break;
            if (col == 8) {
                col = 0;
                row++;
            } else
                col++;
        }
        if (row >= 9) return true;

        int newRow = row + col / 8;
        int newCol = (col + 1) % 9;
        for (int num = 1; num <= 9; num++) {
            if (isValid(board, row, col, num)) {
                board[row][col] = (char) (num + '0');
                boolean result = sudokuSolver(board, newRow, newCol);
                if (result)
                    return true;
                else
                    board[row][col] = '.';
            }
        }
        return false;
    }

    private boolean isValid(char[][] board, int row, int col, int num) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] - '0' == num || board[i][col] - '0' == num)
                return false;
        }

        int rowOff = (row / 3) * 3;
        int colOff = (col / 3) * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[rowOff + i][colOff + j] - '0' == num)
                    return false;
            }
        }
        return true;
    }
}
