package com.LeetCode.Tests;

import com.LeetCodeJack.Problems.P18_4Sum;

import java.util.List;

public class test18_4Sum {
    public static void main(String[] args) {
        P18_4Sum tester = new P18_4Sum();

        int[] inputNums = {1, 0, -1, 0, -2, 2};
//        int[] inputNums = {-3,-2,-1,0,0,1,2,3};
//        int[] inputNums = {0,0,0,0};
//        int[] inputNums = {-5,-5,-3,-1,0,2,4,5};

        int target = 0;
        List<List<Integer>> result = tester.fourSum(inputNums, target);
        System.out.println(result.toString());
    }
}
