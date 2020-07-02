package com.LeetCode.Tests;

import com.LeetCodeJack.Problems.P22_GenerateParentheses;
import java.util.List;

public class  test22_GenerateParentheses {
    public static void main (String[] args){
        P22_GenerateParentheses tester = new P22_GenerateParentheses();
        List<String> result = tester.generateParenthesis(3);
        System.out.println(result.toString());
    }
}
