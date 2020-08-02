package com.LeetCodeJack.Problems2;

public class P63_M_UniquePaths2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1)
            return 0;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] newMap = new int[m][n];
        newMap[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && obstacleGrid[0][j] == 0)
                    newMap[0][j] = (j - 1 >= 0) ? newMap[0][j - 1] : 1;
                else if (j == 0 && obstacleGrid[i][0] == 0)
                    newMap[i][0] = (i - 1 >= 0) ? newMap[i - 1][0] : 1;
                else if (obstacleGrid[i][j] == 1)
                    newMap[i][j] = 0;
                else
                    newMap[i][j] = newMap[i - 1][j] + newMap[i][j - 1];
            }
        }
        return newMap[m - 1][n - 1];
    }
}
