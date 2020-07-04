package com.LeetCode.Tests;

import com.LeetCodeJack.Problems.P8_StringToInteger;

public class test8_StringToInteger {
    public static void main(String[] args) {
        P8_StringToInteger tester = new P8_StringToInteger();
        String input = "2147483646";
        int output = tester.myAtoi(input);
        System.out.println(output);
    }
}
