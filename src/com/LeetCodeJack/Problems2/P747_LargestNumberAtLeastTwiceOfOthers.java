package com.LeetCodeJack.Problems2;

import java.util.Arrays;

public class P747_LargestNumberAtLeastTwiceOfOthers {
    public int dominantIndex(int[] nums) {
        if (nums.length == 0 || nums == null)
            return -1;

        int N = nums.length;
        if (N == 1) return 0;
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        if (sortedNums[N - 1] < sortedNums[N - 2] * 2)
            return -1;
        for (int i = 0; i < N; i++)
            if (nums[i] == sortedNums[N - 1])
                return i;
        return -1;
    }
}
