package com.LeetCode.Tests;

//Given nums=[2,7,11,15],target=9,
//
//        Because nums[0]+nums[1]=2+7=9,
//        return[0,1].

import com.LeetCodeJack.Problems.TwoSum1;
import java.util.Arrays;

public class testTwoSum1 {
    public static void main(String[] args) {
        int[] nums={3,2,4};
        TwoSum1 twoSum=new TwoSum1();
        System.out.println(Arrays.toString(twoSum.twoSum(nums,6)));
    }
}
