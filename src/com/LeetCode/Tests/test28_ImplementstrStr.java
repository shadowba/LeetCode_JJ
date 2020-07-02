package com.LeetCode.Tests;

import com.LeetCodeJack.Problems.P28_Implement_strStr;

public class test28_ImplementstrStr {
    public static void main(String[] args) {
        P28_Implement_strStr tester = new P28_Implement_strStr();
        String input = "mississippi";
        String needle = "sipp";
        int result = tester.strStr(input,needle);
        System.out.println(result);
    }
}
