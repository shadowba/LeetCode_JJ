package com.LeetCodeJack.Problems2;

public class P81_M_SearchInRotatedSortedArray2 {
    public boolean search(int[] nums, int target) {
        if(nums == null || nums.length == 0)
            return false;
        int N = nums.length;
        int rotIdx = 0;
        if(N == 1)
            return nums[0] == target;
        for(int i = 0 ; i < N -1; i++){
            if(nums[i] == target)
                return true;
            if(nums[i] > nums[i+1])
                rotIdx = i+1;
        }
        int left = 0;
        int right = N -1;
        int middle = 0;
        if(rotIdx != 0 && nums[left] <= target && target < nums[rotIdx-1])
            right = rotIdx -1;
        else
            left = rotIdx;

        while(left <=right){
            middle = left + (right - left) / 2;
            if(nums[middle] == target)
                return true;
            else if(target > nums[middle])
                left = middle + 1;
            else
                right = middle - 1;
        }
        return false;
    }
}
