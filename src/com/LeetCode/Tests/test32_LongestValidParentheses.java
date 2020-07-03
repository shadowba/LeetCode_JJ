package com.LeetCode.Tests;

import com.LeetCodeJack.Problems.P32_LongestValidParentheses;

public class test32_LongestValidParentheses {
    public static void main(String[] args) {
        P32_LongestValidParentheses tester = new P32_LongestValidParentheses();
        String s = ")()())";
        int result = tester.longestValidParentheses(s);
        System.out.println(result);
    }
}
