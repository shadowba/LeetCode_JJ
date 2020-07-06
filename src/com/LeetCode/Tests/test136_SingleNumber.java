package com.LeetCode.Tests;

import com.LeetCodeJack.Problems.P136_SingleNumber;

public class test136_SingleNumber {
    public static void main(String[] args) {
//        int[] nums = {4,1,2,1,2};
        int[] nums = {2,2,1};
        P136_SingleNumber tester = new P136_SingleNumber();
        int result = tester.singleNumber(nums);
        System.out.println(result);
    }
}
