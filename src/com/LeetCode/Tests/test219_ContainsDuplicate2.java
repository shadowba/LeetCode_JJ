package com.LeetCode.Tests;

import com.LeetCodeJack.Problems2.P219_ContainsDuplicate2;

public class test219_ContainsDuplicate2 {
    public static void main(String[] args) {
        P219_ContainsDuplicate2 tester = new P219_ContainsDuplicate2();
        int[] nums = {1,2,3,1};
        int k = 3;
        boolean res = tester.containsNearbyDuplicate(nums, k);
        System.out.println(res);
    }
}
