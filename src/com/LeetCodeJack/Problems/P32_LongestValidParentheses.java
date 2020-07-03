package com.LeetCodeJack.Problems;

import java.util.Stack;

public class P32_LongestValidParentheses {
    public int longestValidParentheses(String s) {
//        int result = 0;
//        int N = s.length();
//        if (s == null || s.length() == 0)
//            return result;
//        Stack<Character> strStack = new Stack<>();
//        char[] charArr = s.toCharArray();
//
//        int i = 0;
//        int lastIndex = 0;
//        while(i < N) {
//            if(charArr[i] == '('||strStack.isEmpty())
//                strStack.push(charArr[i]);
//            else{
//
//                if(strStack.pop() == '(' && i == lastIndex + 2 || lastIndex == 0){
//                    result += 2;
//                    lastIndex = i;
//                }
//            }
//            i++;
//        }
//        return result;
    }
}
