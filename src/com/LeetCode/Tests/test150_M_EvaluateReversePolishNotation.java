package com.LeetCode.Tests;

import com.LeetCodeJack.Problems2.P150_M_EvaluateReversePolishNotation;

public class test150_M_EvaluateReversePolishNotation {
    public static void main(String[] args) {
        P150_M_EvaluateReversePolishNotation tester = new P150_M_EvaluateReversePolishNotation();
        String[] tokens = {"4","13","5","/","+"};
        tester.evalRPN(tokens);
    }
}
