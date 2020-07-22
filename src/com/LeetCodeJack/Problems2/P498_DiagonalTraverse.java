package com.LeetCodeJack.Problems2;

import java.util.*;

public class P498_DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0 || matrix == null)
            return new int[0];

        int M = matrix.length; // Row number
        int N = matrix[0].length; // Col number
        int[] resArr = new int[M * N];
        List<Integer> tempList = new ArrayList<>();

        int row = 0;
        int col = 0;
        int j = 0;

        for (int i = 0; i < M + N - 1; i++) {
            tempList.clear();
            col = (i < N) ? i : N - 1;
            row = (i < N) ? 0 : i - col;
            while (row < M && col > -1)
                tempList.add(matrix[row++][col--]);

            if (i % 2 == 0)
                Collections.reverse(tempList);

            for (int num : tempList)
                resArr[j++] = num;
        }

        return resArr;
    }
}
