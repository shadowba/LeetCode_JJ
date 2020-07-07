package com.LeetCodeJack.Problems;

public class P125_ValidPalindrome {
    public boolean isPalindrome(String s) {
        if( s.length() == 0)
            return true;

        s = s.toLowerCase();
        int N = s.length();
        int left = 0;
        int right = N-1;
        while(left <= right && left <= N-1 && right>=0){
            if(!isValid(s.charAt(left))){
                left++;
                continue;
            }
            if(!isValid(s.charAt(right))){
                right--;
                continue;
            }
            if(s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
    private boolean isValid(char ch){
        if((ch - 'a' >=0 && ch - 'a' <26 )|| (ch - '0' >=0 && ch - '0' <10))
            return true;
        return false;
    }
}
