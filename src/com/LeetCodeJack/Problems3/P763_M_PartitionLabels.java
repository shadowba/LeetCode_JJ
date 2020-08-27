package com.LeetCodeJack.Problems3;

import java.util.*;

public class P763_M_PartitionLabels {
    public List<Integer> partitionLabels(String S) {
        List<Integer> resList = new ArrayList<>();
        int[] endIdx = new int[26];
        for (int i = 0; i < S.length(); i++) {
            endIdx[S.charAt(i) - 'a'] = i;
        }

        int left = 0;
        int end = 0;
        int right = 0;
        while (left < S.length()) {
            end = endIdx[S.charAt(left) - 'a'];
            right = left;
            while (right <= end) {
                end = Math.max(endIdx[S.charAt(right) - 'a'], end);
                right++;
            }
            resList.add(right - left);
            left = right;
        }
        return resList;
    }
}
