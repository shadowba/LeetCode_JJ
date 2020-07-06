package com.LeetCode.Tests;

import com.LeetCodeJack.Problems.P58_LengthOfLastWord;

public class test58_LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello     World";
        P58_LengthOfLastWord tester = new P58_LengthOfLastWord();
        int result = tester.lengthOfLastWord(s);
        System.out.println(result);
    }
}
