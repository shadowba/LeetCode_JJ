package com.LeetCode.Tests;

import com.LeetCodeJack.Problems.P30_SubstringWithConcatenationOfAllWords;

import java.util.List;

public class test30_SubstringWithConcatenationOfAllWords {
    public static void main(String[] args) {
        P30_SubstringWithConcatenationOfAllWords tester = new P30_SubstringWithConcatenationOfAllWords();
        String s = "";
        String[] words = {"word", "good", "best", "good"};
        List<Integer > restult = tester.findSubstring(s,words);
        System.out.println(restult);
    }
}
