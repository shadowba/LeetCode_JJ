package com.LeetCodeJack.Problems;

import java.util.Stack;

public class P32_LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int maxRes = 0;
        if (s == null || s.length() == 0)
            return maxRes;
        Stack<Integer> strStack = new Stack<>();
        char[] charArr = s.toCharArray();
        int N = s.length();

        int i = 0;
        int mostLeft = -1;
        strStack.push(mostLeft);
        while (i < N) {
            if (charArr[i] == '(')
                strStack.push(i);
            else {
                strStack.pop();
                if (strStack.isEmpty()) {
                    strStack.push(i);
                    i++;
//                    maxRes = 0;
                    continue;
                } else {
                    maxRes = Math.max(maxRes, i - strStack.peek());
                }
            }
            i++;
        }
        return maxRes;
    }
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
