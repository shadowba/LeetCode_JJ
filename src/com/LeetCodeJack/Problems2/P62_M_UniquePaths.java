package com.LeetCodeJack.Problems2;
//解题思路和走楼梯P70,斐波那契数列P509类似，用到DP的思想
public class P62_M_UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] map = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j< m; j++){
                if(i == 0 || j==0)
                    map[i][j] = 1;
                else
                    map[i][j] = map[i-1][j]+map[i][j-1];

            }
        }
        return map[n-1][m-1];
    }

}
