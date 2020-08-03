package com.LeetCodeJack.Problems2;

public class P91_M_DecodeWays {
    int N;
    public int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        N = s.length();
        int[] dp = new int[N+1];

        dp[0] = 1;
        dp[1] = s.charAt(0) != '0' ? 1 : 0;
        for(int i = 2; i<N; i++){
            int first = Integer.valueOf(s.substring(i - 1, i));
            int second = Integer.valueOf(s.substring(i - 2, i));
            if (first >= 1 && first <= 9) {
                dp[i] += dp[i-1];
            }
            if (second >= 10 && second <= 26) {
                dp[i] += dp[i-2];
            }
        }
        return dp[N];
    }
}
