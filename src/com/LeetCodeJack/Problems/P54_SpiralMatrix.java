package com.LeetCodeJack.Problems;

import java.util.List;
import java.util.ArrayList;

public class P54_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> resList = new ArrayList<>();
        if (matrix.length == 0 || matrix[0].length == 0)
            return resList;

        int top = 0;
        int left = 0;
        int bot = matrix.length - 1;
        int right = matrix[0].length - 1;


        while (top <= bot && left <= right){
            for (int i = left; i <= right; i++)
                resList.add(matrix[top][i]);
            top += 1;
            if(top > bot || left > right)
                break;

            for (int j = top; j <= bot; j++)
                resList.add(matrix[j][right]);
            right -= 1;
            if(top > bot || left > right)
                break;

            for (int m = right; m >= left; m--)
                resList.add(matrix[bot][m]);
            bot -= 1;
            if(top > bot || left > right)
                break;

            for (int n = bot; n >= top; n--)
                resList.add(matrix[n][left]);
            left += 1;
        }
        return resList;
    }
}
