package com.LeetCodeJack.Problems;

public class P704_BinarySearch {
    public int search(int[] nums, int target) {
        if(nums.length == 0)
            return -1;

        int left = 0;
        int right = nums.length - 1;
        int middle = 0;

        while(left <= right){
            middle = left + (right - left)/2;
            if(nums[middle] == target)
                return middle;
            else if (nums[middle] < target){
                left = middle + 1;
            }else
                right = middle - 1;
        }

        return -1;
    }
}
