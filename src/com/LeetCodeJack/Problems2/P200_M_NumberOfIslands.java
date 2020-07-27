package com.LeetCodeJack.Problems2;

public class P200_M_NumberOfIslands {
    int rowNum;
    int colNum;

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;
        rowNum = grid.length;
        colNum = grid[0].length;
        int numOfLands = 0;
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                if (grid[i][j] == '1') {
                    fillLand(grid, i, j);
                    numOfLands++;
                }
            }
        }
        return numOfLands;
    }

    private void fillLand(char[][] grid, int row, int col) {
        if (row < 0 || col < 0 || row >= rowNum || col >= colNum || grid[row][col] == '0')
            return;
        grid[row][col] = '0';
        fillLand(grid, row + 1, col);
        fillLand(grid, row - 1, col);
        fillLand(grid, row, col + 1);
        fillLand(grid, row, col - 1);
    }
}
