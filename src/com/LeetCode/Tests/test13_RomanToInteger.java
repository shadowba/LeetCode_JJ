package com.LeetCode.Tests;

import com.LeetCodeJack.Problems.P13_RomanToInteger;

public class test13_RomanToInteger {
    public static void main(String[] args) {
        String s = "LVIII";
        P13_RomanToInteger tester = new P13_RomanToInteger();
        System.out.println(tester.romanToInt(s));
        System.out.println("END");
    }
}
