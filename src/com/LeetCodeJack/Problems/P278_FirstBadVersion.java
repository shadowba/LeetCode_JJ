package com.LeetCodeJack.Problems;

public class P278_FirstBadVersion {
    public int firstBadVersion(int n) {
        if(n == 1)
            return 1;

        int left = 1;
        int right = n;
        int middle = 0;

        while(left < right){
            middle = left + (right - left) / 2;

            if(isBadVersion(middle) == true)
                right = middle;
            else
                left = middle + 1;
        }
        if(left <= n &&isBadVersion(left) == true)
            return left;
        return -1;
    }










    
    private boolean isBadVersion(int n){
        return false;
    }
}
