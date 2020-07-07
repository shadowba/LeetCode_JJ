package com.LeetCodeJack.Problems;

public class P168_ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        char res = 'A';
        while( n > 0){
            n--; // convert 1~26=A~Z to 0~25=A~Z
            res = (char)(n%26+'A');
            sb.insert(0,res);
            n /= 26;
        }
        return sb.toString();
    }
}
