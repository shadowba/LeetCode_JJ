package com.LeetCode.Tests;

import com.LeetCodeJack.Problems.P39_CombinationSum;
import java.util.List;
public class test39_CombinationSum {
    public static void main(String[] args) {
        P39_CombinationSum tester = new P39_CombinationSum();
        int[] input = {2,3,5};
        int target = 8;
        List<List<Integer>> res = tester.combinationSum(input, target);
        System.out.println(res.toString());
    }
}
