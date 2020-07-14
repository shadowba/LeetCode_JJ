package com.LeetCode.Tests;

import com.LeetCodeJack.Problems.P350_IntersectionOfTwoArrays2;

public class test350_IntersectionOfTwoArrays2 {
    public static void main(String[] args) {
        P350_IntersectionOfTwoArrays2 tester = new P350_IntersectionOfTwoArrays2();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] res = tester.intersect(nums1, nums2);
        System.out.println(res);
    }
}
