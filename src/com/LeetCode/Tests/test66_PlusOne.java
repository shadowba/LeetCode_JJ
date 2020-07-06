package com.LeetCode.Tests;

import com.LeetCodeJack.Problems.P66_PlusOne;

import java.util.Arrays;

public class test66_PlusOne {
    public static void main(String[] args) {
        P66_PlusOne tester = new P66_PlusOne();
        int[] input = {8};
        var output = tester.plusOne(input);
        System.out.println(Arrays.toString(output));
    }
}
