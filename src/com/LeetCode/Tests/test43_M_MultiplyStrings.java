package com.LeetCode.Tests;

import com.LeetCodeJack.Problems2.P43_M_MultiplyStrings;

public class test43_M_MultiplyStrings {
    public static void main(String[] args) {
        var tester = new P43_M_MultiplyStrings();
        String num1 = "15";
        String num2 = "261";
        System.out.println(15*261);
        System.out.println(tester.multiply(num1, num2));
    }
}
