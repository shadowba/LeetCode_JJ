package com.LeetCodeJack.Problems2;

import java.util.*;

public class P90_M_Subsets2 {
    List<List<Integer>> resList;
    int N;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        resList = new ArrayList<>();
        List<Integer> curList = new ArrayList<>();
        resList.add(curList);
        if (nums == null || nums.length == 0)
            return resList;
        N = nums.length;
        Arrays.sort(nums);
        dfsHelper(nums, 0, curList);
        return resList;
    }

    private void dfsHelper(int[] nums, int idx, List<Integer> curList) {
        if (idx == N) {
            return;
        }

        if (idx <= N - 1) {
            curList.add(nums[idx]);
            resList.add(new ArrayList<>(curList));
            dfsHelper(nums, idx + 1, curList);
            curList.remove(curList.size() - 1);
        }
        for (int i = idx + 1; i < N; i++) {
            if (nums[i] != nums[i - 1]) {
                curList.add(nums[i]);
                resList.add(new ArrayList<>(curList));
                dfsHelper(nums, i + 1, curList);
                curList.remove(curList.size() - 1);
            }
        }
    }
}
