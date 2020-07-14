package com.LeetCode.Tests;

import com.LeetCodeJack.Problems.P719_FindKthSmallestPairDistance;

public class test719_FindKthSmallestPairDistance {
    public static void main(String[] args) {
        P719_FindKthSmallestPairDistance tester = new P719_FindKthSmallestPairDistance();
        int[] nums= {2,2,0,1,1,0,0,1,2,0};
        int res = tester.smallestDistancePair(nums, 2);
        System.out.println(res);
    }
}
