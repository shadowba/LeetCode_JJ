package com.LeetCodeJack.Problems;

public class P70_ClimbingStairs {
    public int climbStairs(int n) {
        if( n == 1) return 1;
        if( n == 2) return 2;

        int pre = 1;
        int cur = 2;
        for(int i = 3; i <= n; i++){
            cur = pre + cur;
            pre = cur - pre;
        }
        return cur;
    }
}
