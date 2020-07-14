package com.LeetCodeJack.Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

public class P719_FindKthSmallestPairDistance {
    Set<Integer> disSet = new HashSet<>();

    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = 1;
        while (right <= nums.length - 1) {
            while (right + 1 <= nums.length - 1 && nums[right] == nums[right + 1])
                right += 1;
            if (nums[right] == nums[left]) {
                disSet.add(0);
                right++;
                if (right == nums.length)
                    break;
            }
            disSet.add(Math.abs(nums[right] - nums[left]));
            left = right;
            right++;
        }
        Integer[] resArray = disSet.toArray(new Integer[0]);

        return resArray[(k >= resArray.length) ? (resArray.length - 1) : (k - 1)];
    }
}
