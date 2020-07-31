package com.LeetCodeJack.Problems2;

import java.util.Arrays;

public class P1051_E_HeightChecker {
    public int heightChecker(int[] heights) {
        if(heights == null || heights.length == 0)
            return 0;
        int N = heights.length;
        int[] heightsCopy = Arrays.copyOf(heights, N);
        int res = 0;
        Arrays.sort(heightsCopy);
        for(int i = 0; i<N; i++){
            if(heightsCopy[i] != heights[i])
                res++;
        }
        return res;
    }

}
