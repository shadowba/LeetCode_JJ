package com.LeetCodeJack.Problems2;

public class P64_M_MinimumPathSum {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;

        int m = grid.length;
        int n = grid[0].length;
        int[][] sumMap = new int[m][n];
        sumMap[0][0] = grid[0][0];
        for (int i = 1; i < n; i++)
            sumMap[0][i] = grid[0][i] + sumMap[0][i - 1];

        for (int i = 1; i < m; i++)
            sumMap[i][0] = grid[i][0] + sumMap[i - 1][0];
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                sumMap[i][j] = grid[i][j] + Math.min(sumMap[i][j - 1], sumMap[i - 1][j]);
            }
        }
        return sumMap[m - 1][n - 1];
    }
}
