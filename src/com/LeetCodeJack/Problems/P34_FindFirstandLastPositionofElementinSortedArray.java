package com.LeetCodeJack.Problems;

public class P34_FindFirstandLastPositionofElementinSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        if (nums == null || nums.length == 0)
            return res;

        int leftIndex = findLeftIndex(nums, target);
        int rightIndex = findRightIndex(nums, target);

        res[0] = leftIndex;
        res[1] = rightIndex;

        return res;
    }

    private int findLeftIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle = -1;
        int leftIndex = -1;
        while (left <= right) {
            middle = left + (right - left) / 2;
            if (nums[middle] >= target)
                right = middle - 1;
            else
                left = middle + 1;

            if (nums[middle] == target) leftIndex = middle;
        }
        return leftIndex;
    }

    private int findRightIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle = -1;
        int rightIndex = -1;
        while (left <= right) {
            middle = left + (right - left) / 2;
            if (nums[middle] <= target)
                left = middle + 1;
            else
                right = middle - 1;

            if (nums[middle] == target) rightIndex = middle;
        }
        return rightIndex;
    }
}
