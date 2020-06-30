package com.LeetCodeJack.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P18_4Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3 || nums == null)
            return result;

        int residue;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            while (i - 1 > -1 && i < nums.length - 3 && nums[i] == nums[i - 1])
                i++;
            for (int j = i + 1; j < nums.length - 2; j++) {
                while (j - 1 > i && j < nums.length - 2 && nums[j] == nums[j - 1])
                    j++;
                residue = target - nums[i] - nums[j];
                twoSum(nums, j + 1, nums.length - 1, residue, i, j, result);
            }
        }
        return result;
    }

    private void twoSum(int[] nums, int left, int right, int target, int i, int j, List<List<Integer>> result) {
        int sum;
        while (left < right && left >= 1 && right < nums.length) {
            sum = nums[left] + nums[right];
            if (sum > target)
                right--;
            else if (sum < target)
                left++;
            else {
                result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                while (left < nums.length - 1 && left < right && nums[left] == nums[left + 1])
                    left++;
                while (right > 2 && left < right && nums[right] == nums[right - 1])
                    right--;

                left++;
                right--;
            }
        }
    }
}
