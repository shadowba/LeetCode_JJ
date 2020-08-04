package com.LeetCodeJack.Problems3;

import java.util.*;

public class P120_M_Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int N = triangle.size();
        int sum[] = new int[N + 1];
        int num1 = 0;
        int num2 = 0;
        for (int i = N - 1; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                sum[j] = Math.min(sum[j], sum[j + 1]) + triangle.get(i).get(j);
            }
        }
        return sum[0];
    }
}

//        Over Timing
//    int N;
//    Set<Integer> sumSet;
//    int minSum;
//
//    public int minimumTotal(List<List<Integer>> triangle) {
//        N = triangle.size();
//        minSum = Integer.MAX_VALUE;
//        minSum = helperDfs(triangle, 0,0, 0);
//        return minSum;
//    }
//
//    private int helperDfs(List<List<Integer>> triangle, int level, int idx,int sum) {
//        if (level == N ) {
//            return sum;
//        }
//        int val= 0;
//        for (int i = 0; i < ((level >0)?2:1); i++){
//            sum += triangle.get(level).get(idx+i);
//            val = helperDfs(triangle, level +1, idx + i, sum);
//            minSum = Math.min(minSum, val);
//            sum -= triangle.get(level).get(idx);
//        }
//        return minSum;
//    }
