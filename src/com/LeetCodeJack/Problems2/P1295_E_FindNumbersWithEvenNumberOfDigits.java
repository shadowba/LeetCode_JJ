package com.LeetCodeJack.Problems2;

public class P1295_E_FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        int res = 0;
        int digits = 0;
        for(int num : nums){
            while(num != 0){
                num /= 10;
                digits++;
            }
            if(digits % 2 == 0) res++;
            digits = 0;
        }
        return res;
    }
}
