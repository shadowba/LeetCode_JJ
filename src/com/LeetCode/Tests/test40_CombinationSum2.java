package com.LeetCode.Tests;

import com.LeetCodeJack.Problems.P39_CombinationSum;
import com.LeetCodeJack.Problems.P40_CombinationSum2;

import java.util.List;

public class test40_CombinationSum2 {
    public static void main(String[] args) {
        P40_CombinationSum2 tester = new P40_CombinationSum2();
        int[] input = {1,2,2,2,5};

        int target = 5;
        List<List<Integer>> res = tester.combinationSum2(input, target);
        System.out.println(res.toString());
    }
}
