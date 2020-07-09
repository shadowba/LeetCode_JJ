package com.LeetCodeJack.Problems;

import java.util.HashMap;
import java.util.Map;

public class P70_ClimbingStairs {
//       --- Recursive Way (Memoisation) ---
    Map<Integer, Integer> stairMap = new HashMap<>();

    public int climbStairs(int n) {
        if(stairMap.containsKey(n))
            return stairMap.get(n);
        if(n == 1)
            return stairMap.getOrDefault(1, 1);
        if(n == 2)
            return stairMap.getOrDefault(2, 2);

        int res;
        res = climbStairs(n - 1) + climbStairs( n - 2);
        stairMap.put(n , res);
        return res;
    }

//      --- Iteration Way ---
//    public int climbStairs(int n) {
//        if( n == 1) return 1;
//        if( n == 2) return 2;
//
//        int pre = 1;
//        int cur = 2;
//        for(int i = 3; i <= n; i++){
//            cur = pre + cur;
//            pre = cur - pre;
//        }
//        return cur;
//    }
}
