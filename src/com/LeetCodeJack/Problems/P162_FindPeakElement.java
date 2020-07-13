package com.LeetCodeJack.Problems;

public class P162_FindPeakElement {
    public int findPeakElement(int[] nums) {
        if(nums.length == 0 || nums == null)
            return -1;
        if(nums.length == 1)
            return 0;

        int left = 0;
        int right = nums.length - 1;
        int middle = 0;

        while (left < right){
            middle = left + (right - left) / 2;
            if( nums[middle + 1] < nums[middle] )
                right = middle;
            else
                left = middle + 1;
        }

        if(left < nums.length)
            return left;
        else
            return -1;

    }
}
