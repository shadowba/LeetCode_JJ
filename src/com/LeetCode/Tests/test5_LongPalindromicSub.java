package com.LeetCode.Tests;

import com.LeetCodeJack.Problems.P5_LongPalindromicSub;

public class test5_LongPalindromicSub {
    public static void main(String[] args) {
        P5_LongPalindromicSub palindromicSub = new P5_LongPalindromicSub();
        String s1 = "babad";
        String s2 = "cbbd";
        String s3 = "aba";
        String s4 = "xabax";
        String s5 = "xabay";
        String s6="";
        String s7=new String();
        String s8=" ";

        System.out.println(palindromicSub.longestPalindrome(s1));
        System.out.println(palindromicSub.longestPalindrome(s2));
        System.out.println(palindromicSub.longestPalindrome(s3));
        System.out.println(palindromicSub.longestPalindrome(s4));
        System.out.println(palindromicSub.longestPalindrome(s5));
        System.out.println(palindromicSub.longestPalindrome(s6));
        System.out.println(palindromicSub.longestPalindrome(s7));
        System.out.println(palindromicSub.longestPalindrome(s8));
    }
}
