package com.LeetCodeJack.Problems;

import java.util.Arrays;

public class P16_3SumClosest {
    public int threeSumClosest(int[] nums, int target) {
        short left = 0;
        short right = 0;
        short minDiff = Short.MAX_VALUE;
        short sum = 0;
        short result = 0;
        Arrays.sort(nums);

        for (short i = 0; i < nums.length - 2; i++) {
            left =(short)(i + 1);
            right = (short) (nums.length - 1);

            while (left < right) {
                sum =(short)(nums[i] + nums[left] + nums[right]) ;
                result = (Math.abs(sum - target) <= minDiff) ? sum : result;
                if (sum < target) {
                    minDiff = (short) Math.min(minDiff, Math.abs(sum - target));
                    left++;
                } else if (sum > target) {
                    minDiff = (short) Math.min(minDiff, Math.abs(sum - target));
                    right--;
                } else {
                    return result;
                }
            }
        }
        return result;
    }
}
