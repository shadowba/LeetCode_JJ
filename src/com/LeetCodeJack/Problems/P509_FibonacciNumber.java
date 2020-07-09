package com.LeetCodeJack.Problems;

import java.util.HashMap;
import java.util.Map;

public class P509_FibonacciNumber {
    Map<Integer, Integer> fibMap = new HashMap<>();

    public int fib(int N) {
        if (fibMap.containsKey(N))
            return fibMap.get(N);
        if (N == 0) {
            return fibMap.getOrDefault(0, 0);
        }
        if ( N == 1){
            return fibMap.getOrDefault(1, 1);
        }

        int res = fib(N - 1) + fib(N - 2);

        fibMap.put(N, res);
        return res;
    }
}
