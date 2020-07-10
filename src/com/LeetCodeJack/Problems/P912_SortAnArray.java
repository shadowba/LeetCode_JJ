package com.LeetCodeJack.Problems;

import java.util.Arrays;

public class P912_SortAnArray {
    public int[] sortArray(int[] nums) {
        if (nums.length <= 1)
            return nums;
        int pivot = nums.length/2;
        int[] leftSubList = sortArray(Arrays.copyOfRange(nums,0, pivot));
        int[] rightSubList = sortArray(Arrays.copyOfRange(nums,0, pivot));
        return merge(leftSubList, rightSubList);
    }

    private int[] merge(int[] leftSubList, int[] rightSubList) {
        int[] res = new int[leftSubList.length + rightSubList.length];
        int leftCur = 0;
        int rightCur = 0;
        int resCur = 0;
        while (leftCur < leftSubList.length && rightCur < rightSubList.length) {
            if (leftSubList[leftCur] <= rightSubList[rightCur])
                res[resCur++] = leftSubList[leftCur++];
            else
                res[resCur++] = rightSubList[rightCur++];
        }
        if (leftCur < leftSubList.length) {
            while (leftCur < leftSubList.length) {
                res[resCur++] = leftSubList[leftCur++];
            }
        } else if (rightCur < rightSubList.length) {
            while (rightCur < rightSubList.length) {
                res[resCur++] = rightSubList[rightCur++];
            }
        }
        return res;
    }
}
