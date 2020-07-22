package com.LeetCodeJack.Problems2;

import java.util.*;

public class P347_TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        if (nums.length == 0 || nums == null)
            return res;

        Map<Integer, Integer> numMap = new HashMap<>();
        Map<Integer, Integer> cntMap = new HashMap<>();
        for (int num : nums)
            numMap.put(num, numMap.getOrDefault(num, 0) + 1);

        Queue<Integer> que = new PriorityQueue<>((n1, n2) -> numMap.get(n1) - numMap.get(n2));
        for (int n : numMap.keySet()) {
            que.add(n);
            if (que.size() > k) que.poll();
        }

        for (int i = k - 1; i >= 0; i--) {
            res[i] = que.poll();
        }
        return res;
    }
}
