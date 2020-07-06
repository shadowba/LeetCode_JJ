package com.LeetCode.Tests;

import com.LeetCodeJack.Problems.P35_SearchInsertPosition;

public class test35_SearchInsertPosition {
    public static void main(String[] args) {
        P35_SearchInsertPosition tester = new P35_SearchInsertPosition();
        int[] nums = {1,3,5,6};
        int target = 0;
        int result = tester.searchInsert(nums, target);
        System.out.println(result);
    }
}
