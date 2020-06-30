package com.LeetCode.Tests;

import com.LeetCodeJack.Problems.P17_LetterCombinationsOfPhoneNumber;

import java.util.List;
import java.util.ArrayList;

public class test17_LetterCombinationsOfPhoneNumber {
    public static void main(String[] args) {
        P17_LetterCombinationsOfPhoneNumber tester = new P17_LetterCombinationsOfPhoneNumber();
        List<String> result = new ArrayList<>();
        String input = "2";
        result = tester.letterCombinations(input);
        System.out.println(result.toString());

    }
}
