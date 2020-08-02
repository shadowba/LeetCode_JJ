package com.LeetCodeJack.Problems2;

public class P74_M_SearchA2DMatrix {
    int m;
    int n;

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0)
            return false;
        m = matrix.length;
        n = matrix[0].length;
        int row = rowBiSearch(matrix, target);
        return colBiSearch(matrix, target, row);

    }

    private int rowBiSearch(int[][] matrix, int target) {
        int bot = 0;
        int top = m - 1;
        int middle = bot + (top - bot) / 2;
        while (bot < top) {
            middle = bot + (top - bot) / 2;
            if (target >= matrix[middle][0] && target < matrix[middle + 1][0])
                return middle;
            else if (target > matrix[middle][0])
                bot = middle + 1;
            else
                top = middle - 1;
        }
        return bot;
    }

    private boolean colBiSearch(int[][] matrix, int target, int row) {
        int left = 0;
        int right = n - 1;
        int middle = 0;
        while (left <= right) {
            middle = left + (right - left) / 2;
            if (matrix[row][middle] == target)
                return true;
            else if (target > matrix[row][middle])
                left = middle + 1;
            else
                right = middle - 1;
        }
        return false;
    }
}
