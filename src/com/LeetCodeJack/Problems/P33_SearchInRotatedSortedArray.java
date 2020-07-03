package com.LeetCodeJack.Problems;

public class P33_SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;

        int left = 0;
        int right = nums.length - 1;
        int middle = left + (right - left) / 2;
        int pivot = 0;

        while (left <= right) {
            if (nums[middle] > nums[right])
                left = middle + 1;
            else if (nums[middle] < nums[right])
                right = middle ;
            else {
                pivot = left;
                break;
            }
            middle = left + (right - left) / 2;
        }


        if(target >= nums[pivot] && target <= nums[nums.length - 1]){
            left = pivot;
            right = nums.length - 1;
        }else{
            right = pivot;
            left = 0;
        }

//        if (target > nums[pivot]) {
//            left = pivot;
//            right = nums.length - 1;
//        } else if (target < nums[pivot]) {
//            left = 0;
//            right = pivot;
//        } else
//            return pivot;

        middle = left + (right - left) / 2;
        while (left <= right) {
            if (target > nums[middle])
                left = middle + 1;
            else if (target < nums[middle])
                right = middle - 1;
            else
                return middle;
            middle = left + (right - left) / 2;
        }
        return -1;
    }
}
