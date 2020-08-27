package com.LeetCodeJack.Problems3;

import java.util.*;

public class P994_M_RottingOranges {
    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0)
            return -1;
        int m = grid.length;
        int n = grid[0].length;
        int time = 0;
        Queue<Integer> xQ = new LinkedList<>();
        Queue<Integer> yQ = new LinkedList<>();
        int size = 0;
        int i = 0;
        int j = 0;
        int totalOranges = 0;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    xQ.offer(i);
                    yQ.offer(j);
                } else if (grid[i][j] == 1)
                    totalOranges++;
            }
        }

        while (!xQ.isEmpty()) {
            size = xQ.size();

            while (size > 0) {
                i = xQ.poll();
                j = yQ.poll();

                if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                    grid[i-1][j] = 2;
                    totalOranges--;
                    xQ.offer(i - 1);
                    yQ.offer(j);
                }
                if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                    grid[i][j-1] = 2;
                    totalOranges--;
                    xQ.offer(i);
                    yQ.offer(j - 1);
                }
                if (i + 1 <= m - 1 && grid[i + 1][j] == 1) {
                    grid[i+1][j] = 2;
                    totalOranges--;
                    xQ.offer(i + 1);
                    yQ.offer(j);
                }
                if (j + 1 <= n - 1 && grid[i][j + 1] == 1) {
                    grid[i][j+1] = 2;
                    totalOranges--;
                    xQ.offer(i);
                    yQ.offer(j + 1);
                }
                size--;
            }
            time++;
        }

        if (totalOranges != 0) return -1;
        return (time==0)?0:time-1;
    }
}
