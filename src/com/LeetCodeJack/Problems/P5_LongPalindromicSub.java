package com.LeetCodeJack.Problems;

public class P5_LongPalindromicSub {

    public String longestPalindrome(String s) {
        if(s.length()==0||s==null)
            return "";

        final int N = s.length();
        int start = 0;
        int end = 0;
        int newLen = 0;
        int oldLen = end - start + 1;

        for (int i = 0; i < N; i++) {
            newLen = Math.max(getSubLenFromCenter(s, i, i),
                    getSubLenFromCenter(s, i, i + 1));
            if (newLen > oldLen) {
                start = i - (newLen - 1) / 2;
                end = i + newLen / 2;
                oldLen = end - start + 1;
            }
        }

        return s.substring(start,end+1);
    }

    int getSubLenFromCenter(String s, int left, int right) {
        int L = left;
        int R = right;
        while (L >= 0 && R < s.length()
                && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}
