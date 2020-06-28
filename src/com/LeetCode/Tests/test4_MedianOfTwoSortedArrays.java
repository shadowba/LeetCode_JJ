package com.LeetCode.Tests;

import com.LeetCodeJack.Problems.P4_MedianOfTwoSortedArrays;

public class test4_MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        P4_MedianOfTwoSortedArrays tester=new P4_MedianOfTwoSortedArrays();
        int[] num1={1,3,5,7,9};
        int[] num2={2,4,6,8,10,12};
        var result=tester.findMedianSortedArrays(num1,num2);

        System.out.println(result);

    }
}
