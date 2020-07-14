package com.LeetCodeJack.Problems;

public class P154_FindMinimumInRotatedSortedArray2 {
    public int findMin(int[] nums) {
        if (nums.length == 0 || nums == null)
            return 0;
        if (nums.length == 1)
            return nums[0];

        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        while (left + 1 < right) {
            while (nums[left] == nums[left + 1] && left + 1 < right) {
                left += 1;
            }
            mid = left + (right - left) / 2;
            if (nums[mid] > nums[right])
                left = mid;
            else
                right = mid;
        }

        if (nums[left] <= nums[right]) return nums[left];
        else return nums[right];
    }
}
