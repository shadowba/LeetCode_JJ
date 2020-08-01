package com.LeetCodeJack.Problems2;

public class P56_M_MergeIntervals {
    public int[][] merge(int[][] intervals) {
        int N = intervals.length;
        int left = 0;
        int right = 0;
        int nLeft= 0;
        int nRight = 0;

        int[] mergeTbl = new int[N];
        int count = N;
        for(int i =0; i<N-1; i++){
            for(int j = i+1; j < N; j++){
                left = intervals[i][0];
                right = intervals[i][1];
                nLeft = intervals[j][0];
                nRight = intervals[j][1];
                if((left <= nLeft && nLeft <= right) ||(nLeft <= left && left <= nRight)){
                    intervals[j][0] = Math.min(left, nLeft);
                    intervals[j][1] = Math.max(right, nRight);
                    mergeTbl[j] = 1;
                    mergeTbl[i] = -1;
                    count--;
                    break;
                }
            }

        }
        int[][] res = new int[count][2];
        int idx = 0;
        for(int i = 0; i<N; i++){
            if(mergeTbl[i] != -1)
                res[idx++] = intervals[i];
        }
        return res;
    }
}
