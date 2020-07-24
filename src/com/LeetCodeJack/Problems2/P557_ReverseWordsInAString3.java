package com.LeetCodeJack.Problems2;

import java.util.*;

public class P557_ReverseWordsInAString3 {

    public String reverseWords(String s) {
        StringBuilder ansSb = new StringBuilder();
        StringBuilder tempSb = new StringBuilder();
        if (s.length() == 0 || s.isBlank() || s == null)
            return "";
        int N = s.length();
        char[] charArr = s.toCharArray();
        int end;

        // ---- Split method ---- //
        String[] strArr = s.split(" ");
        for(int i = 0; i < strArr.length; i++){
            tempSb.append(strArr[i]).reverse();
            ansSb.append(tempSb.toString() +" ");
            tempSb.delete(0,tempSb.length());
        }
        return ansSb.toString().trim();


        // ---- Two Pointers Method ---- //
//        for (int start = 0; start < N; start++) {
//            if (charArr[start] == ' ') continue;
//            end = start;
//            while (end < N && charArr[end] != ' ')
//                end++;
//            tempSb.append(s.substring(start, end));
//            tempSb.reverse();
//            ansSb.append(tempSb.toString()+" ");
//            tempSb.delete(0,tempSb.length());
//            start = end;
//        }
//        return ansSb.toString().trim();
    }
}
