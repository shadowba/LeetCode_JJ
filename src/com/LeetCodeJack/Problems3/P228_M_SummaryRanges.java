package com.LeetCodeJack.Problems3;

import java.util.*;

public class P228_M_SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> resList = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return resList;
        int N = nums.length;
        int left = 0;
        int slow = left;
        int fast = left + 1;
        StringBuilder sb = new StringBuilder();
        while (fast <= N) {
            while (fast < N && nums[fast] <= nums[slow] + 1) {
                slow++;
                fast++;
            }
            if (fast == N || nums[fast] > nums[slow] + 1) {
                if (slow > left) {
                    sb.append(nums[left] + "->" + nums[slow]);
                    resList.add(sb.toString());
                } else {
                    sb.append(nums[left]);
                    resList.add(sb.toString());
                }
                sb.delete(0, sb.length());
                left = fast;
                slow = left;
                fast = left + 1;
            }
        }
        return resList;
    }
}
