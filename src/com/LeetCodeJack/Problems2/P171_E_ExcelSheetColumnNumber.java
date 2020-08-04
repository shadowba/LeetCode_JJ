package com.LeetCodeJack.Problems2;

public class P171_E_ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int N = s.length();
        int x = 0;
        int val = 0;
        for(int i = 0; i < N; i++){
            x = s.charAt(i) - 'A'+1;
            val = val*26 + x;
        }
        return val;
    }
}
