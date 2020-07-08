package com.LeetCodeJack.Problems;

public class P344_ReverseString {
    public void reverseString(char[] s) {
        if(s.length == 0 || s == null)
            return;
        swapString(s, 0, s.length-1);
    }
    private void swapString(char[] s, int leftIdx, int rightIdx){
        if(leftIdx > rightIdx){
            return;
        }
        char temp = s[leftIdx];
        s[leftIdx] = s[rightIdx];
        s[rightIdx] = temp;

        swapString(s, ++leftIdx, --rightIdx);
    }
}
