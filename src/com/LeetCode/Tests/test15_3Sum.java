package com.LeetCode.Tests;

import com.LeetCodeJack.Problems.P15_3Sum;

public class test15_3Sum {
    public static void main(String[] args) {
        P15_3Sum tester = new P15_3Sum();
        int[] input = {-1, 0, 1, 2, -1, -4};
//        int[] input={1,1,1};

        String output = tester.threeSum(input).toString();
        System.out.println(output);
    }
}
