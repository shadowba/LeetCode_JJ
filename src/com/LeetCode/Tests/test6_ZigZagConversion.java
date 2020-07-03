package com.LeetCode.Tests;

import com.LeetCodeJack.Problems.P6_ZigZagConversion;

public class test6_ZigZagConversion {
    public static void main(String[] args) {
        P6_ZigZagConversion tester = new P6_ZigZagConversion();
        String s = "PAYPALISHIRING";
        int nums = 3;
        String corResult = "PAHNAPLSIIGYIR";
        String res = tester.convert(s,nums);
        System.out.println(res);
        System.out.println(res.equals(corResult));
    }
}
