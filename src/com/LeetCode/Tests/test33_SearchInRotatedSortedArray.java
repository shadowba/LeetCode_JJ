package com.LeetCode.Tests;

import com.LeetCodeJack.Problems.P33_SearchInRotatedSortedArray;

public class test33_SearchInRotatedSortedArray {
    public static void main(String[] args) {
        P33_SearchInRotatedSortedArray tester = new P33_SearchInRotatedSortedArray();
        int[] nums = {5,1,3};
        int target = 1;
        int result = tester.search(nums,target);
        System.out.println(result);

    }

}
