package com.LeetCodeJack.Problems;

public class P9_PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;

        final int original=x;
        int pop=0;
        int rev=0;

        while (x!=0){
            pop=x%10;
            x/=10;
            if(x>Integer.MAX_VALUE/10||(x==Integer.MAX_VALUE/10)&&pop>7)
                return false;
            rev=rev*10+pop;
        }

        return rev==original;
    }
}
