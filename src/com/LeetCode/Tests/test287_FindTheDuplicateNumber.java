package com.LeetCode.Tests;

import com.LeetCodeJack.Problems.P287_FindTheDuplicateNumber;

public class test287_FindTheDuplicateNumber {
    public static void main(String[] args) {
        P287_FindTheDuplicateNumber tester = new P287_FindTheDuplicateNumber();
        int[] nums = {1,3,4,2,2};
        System.out.println(tester.findDuplicate(nums));
    }
}
