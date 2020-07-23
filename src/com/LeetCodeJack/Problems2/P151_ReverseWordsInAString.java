package com.LeetCodeJack.Problems2;

import java.util.*;

public class P151_ReverseWordsInAString {
    public String reverseWords(String s) {
        int N = s.length();
        if (N == 0 || s == null ||s.isBlank())
            return "";

        char[] charArr = s.toCharArray();
        Stack<String> strStack = new Stack<>();
        int end = 0;
        for (int start = 0; start < N; start++) {
            if (charArr[start] == ' ') continue;
            end = start;
            while (end < N && charArr[end] != ' ') end++;
            strStack.push(s.substring(start, end));
            start = end;
        }
        StringBuilder sb = new StringBuilder();
        int size = strStack.size();
        for (int i = 1; i <= size - 1; i++) {
            sb.append(strStack.pop());
            sb.append(" ");
        }
        sb.append(strStack.pop());
        return sb.toString();
    }
}
