package com.LeetCodeJack.Problems2;

import java.util.*;

public class P73_M_SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rowSet = new LinkedHashSet<>();
        Set<Integer> colSet = new LinkedHashSet<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }
        for (int row : rowSet) {
            for (int j = 0; j < n; j++) {
                matrix[row][j] = 0;
            }
        }
        for (int col : colSet) {
            for (int i = 0; i < m; i++) {
                matrix[i][col] = 0;
            }
        }
    }
}
