package com.LeetCode.Tests;

import com.LeetCodeJack.Problems.P15_3Sum;
import com.LeetCodeJack.Problems.P16_3SumClosest;

public class test16_3SumClosest {
    public static void main(String[] args) {
        P16_3SumClosest tester = new P16_3SumClosest();
        int[] input = {-1, 2, 1, -4};
        int target = 1;
        int result = tester.threeSumClosest(input, target);

        System.out.println(result);
    }
}
