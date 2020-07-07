package com.LeetCode.Tests;

import com.LeetCodeJack.Problems.P125_ValidPalindrome;
import org.w3c.dom.ls.LSOutput;

public class test125_ValidPalindrome {
    public static void main(String[] args) {
        P125_ValidPalindrome tester = new P125_ValidPalindrome();
        String input = "0P";
        boolean result = tester.isPalindrome(input);
        System.out.println(result);
    }
}
