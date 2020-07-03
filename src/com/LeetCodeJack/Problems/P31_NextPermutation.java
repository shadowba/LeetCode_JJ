package com.LeetCodeJack.Problems;

public class P31_NextPermutation {
    public void nextPermutation(int[] nums) {
        if (nums.length == 0 || nums == null)
            return;

        int leftP = nums.length - 2;
        int rightP = nums.length - 1;
//        int swapIndex1 = 0;
//        int swapIndex2 = 0;

        while (leftP > -1) {
            if (nums[leftP] < nums[leftP + 1]) {
//                swapIndex1 = leftP;
                break;
            }
            leftP--;
        }
        if (leftP == -1) {
            reverseSubArr(nums, leftP + 1, rightP);
            return;
        }

        while (rightP > leftP) {
            if (nums[rightP] > nums[leftP]) {
//                swapIndex2 = rightP;
                swapTwoElements(nums, leftP, rightP);
                break;
            }
            rightP--;
        }
        reverseSubArr(nums, leftP + 1, nums.length - 1);
    }

    private void reverseSubArr(int[] nums, int left, int right) {
        while (left <= right) {
            swapTwoElements(nums, left++, right--);
        }
    }

    private void swapTwoElements(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
