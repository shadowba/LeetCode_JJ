package com.LeetCodeJack.Problems;

public class P35_SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle = 0;
        int res = 0;
        while(left <= right){
            middle = left + (right - left)/2;
            if(nums[middle] == target)
                return middle;
            else if(nums[middle] > target)
                right = middle - 1;
            else
                left = middle + 1;
        }
        left = Math.min(nums.length-1, left);
        if(target < nums[left])
            res = left;
        else
            res = left + 1;
        return res;
    }
}
