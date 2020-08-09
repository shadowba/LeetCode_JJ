package com.LeetCodeJack.Problems3;

import java.util.*;

public class P215_M_KthLargestElementInAnArray {
    //  用更为复杂的 QuickSelect 即用 QuickSort 的思想
    //  https://www.youtube.com/watch?v=zyskis1Gw0c
    
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return 0;
        randomize(nums);
        int left= 0;
        int right = nums.length -1;
//        假如有10个数，如果我们要找第 6 大的数， 也就是找第4小的数，
//        第4小的数在一个已经排序的数组里坐标是(4-1) 即为3
        int targetKIdx = nums.length - k - 1;
        int pivotIdx = 0;
        while (left <= right) {
            pivotIdx = quickSortOneTime(nums, left, right);
            if (targetKIdx == pivotIdx - 1)
                return nums[pivotIdx];
            else if (targetKIdx < pivotIdx -1)
                right = pivotIdx - 1;
            else
                left = pivotIdx + 1;
        }
        return 0;
    }

    private int quickSortOneTime(int[] nums, int left, int right) {
        int pivot = right;
        int slow = left - 1;
        int fast = left;
        while (fast < pivot) {
            if (nums[fast] > nums[pivot])
                fast++;
            else {
                slow++;
                swap(nums, slow, fast);
                fast++;
            }
        }
        swap(nums, slow + 1, pivot);
        return slow + 1;
    }

    private void randomize(int[] nums) {
        int targetIdx = 0;
        Random rand = new Random();
        for (int i = nums.length - 1; i > 0; i--) {
            targetIdx = rand.nextInt(i + 1);
            swap(nums, targetIdx, i);
        }
    }

    private void swap(int[] nums, int idx1, int idx2) {
        int temp = 0;
        temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
}
    //  用 priority Queue 的方法，在找第几大第几小的问题中经常用到priority Queue
//    public int findKthLargest(int[] nums, int k) {
//        if (nums == null || nums.length == 0)
//            return 0;
//        Queue<Integer> q = new PriorityQueue<>();
//        for (int num : nums) {
//            q.offer(num);
//            if (q.size() > k)
//                q.poll();
//        }
//        return q.poll();
//    }