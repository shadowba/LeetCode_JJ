package com.LeetCodeJack.Problems;
import java.util.List;
import java.util.ArrayList;
public class P54_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.size;
        int top = 0;
        int left = 0;
        int bot = matrix.size - 1;
        int right = matrix[0].size - 1;
        List<Integer> resList = new ArrayList<>();

        for(int num:matrix[top])
            resList.add(num);
        for(int i = top+1; )
    }
}
