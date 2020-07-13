package com.LeetCodeJack.Problems;

public class P367_ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if(num < 0 )
            return false;

        int right = 46340; // Magic number
        int left = 0;
        int mid;
        int res;
        while(left <= right){
            mid = left +(right - left)/2;
            res = mid * mid;
            if(res == num)
                return true;
            else if(res < num )
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }
}
