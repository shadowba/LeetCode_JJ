package com.LeetCode.Tests;

import com.LeetCodeJack.Problems.P20_ValidParentheses;

public class test20_ValidParentheses {
    public static void main(String[] args) {
        String input ="]";
        P20_ValidParentheses tester = new P20_ValidParentheses();
        System.out.println(tester.isValid(input));

    }
}
