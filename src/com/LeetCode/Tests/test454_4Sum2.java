package com.LeetCode.Tests;

import com.LeetCodeJack.Problems2.P454_4Sum2;

public class test454_4Sum2 {
    public static void main(String[] args) {
        int[] A = {-1, -1};
        int[] B = {-1, 1};
        int[] C = {-1, 1};
        int[] D = {1, -1};
        P454_4Sum2 tester = new P454_4Sum2();
        int res = tester.fourSumCount(A,B,C,D);
        System.out.println(res);
    }
}
