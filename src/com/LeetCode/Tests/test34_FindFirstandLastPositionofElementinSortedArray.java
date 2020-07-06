package com.LeetCode.Tests;

import com.LeetCodeJack.Problems.P34_FindFirstandLastPositionofElementinSortedArray;

import java.util.Arrays;

public class test34_FindFirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {
        P34_FindFirstandLastPositionofElementinSortedArray tester = new P34_FindFirstandLastPositionofElementinSortedArray();
//        int[] nums = {5,7,7,8,8,10};
//        int target = 10;
        int[] nums = {1};
        int target = 1;
        var result = tester.searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
