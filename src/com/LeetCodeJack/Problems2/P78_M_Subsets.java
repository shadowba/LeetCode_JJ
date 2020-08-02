package com.LeetCodeJack.Problems2;

import java.util.*;

public class P78_M_Subsets {
    List<List<Integer>> resList = new ArrayList<>();
    int N;

    public List<List<Integer>> subsets(int[] nums) {
        resList.add(new ArrayList<>());
        if (nums == null || nums.length == 0)
            return resList;
        N = nums.length;
        List<Integer> curList = new ArrayList<>();

        dfsHelper(nums, 0, curList);
        return resList;
    }

    private void dfsHelper(int[] nums, int idx, List<Integer> curList) {
        if (idx > N - 1) {
            return;
        }

        for (int i = idx; i < N; i++) {
            curList.add(nums[i]);
            resList.add(new ArrayList<>(curList));
            dfsHelper(nums, i + 1, curList);
            curList.remove(curList.size() - 1);
        }
    }
}
