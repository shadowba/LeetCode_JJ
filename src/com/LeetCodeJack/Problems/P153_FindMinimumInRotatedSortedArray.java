package com.LeetCodeJack.Problems;

public class P153_FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        if(nums.length == 0 || nums == null)
            return -1;
        // if(nums.length == 1)
        //     return 0;

        int left = 0;
        int right = nums.length - 1;
        int middle = 0;

        while(left < right){
            middle = (left + right) / 2;
            if(nums[middle] > nums[right])
                left = middle + 1;
            else
                right = middle;
        }
        if(left < nums.length)
            return nums[left];

        return -1;
    }
}
