package com.LeetCode.Tests;

//Given nums=[2,7,11,15],target=9,
//
//        Because nums[0]+nums[1]=2+7=9,
//        return[0,1].

import com.LeetCodeJack.Problems.P1_TwoSum;
import java.util.Arrays;

public class test1_TwoSum {
    public static void main(String[] args) {
        int[] nums={3,2,4};
        P1_TwoSum twoSum=new P1_TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(nums,6)));
    }
}
