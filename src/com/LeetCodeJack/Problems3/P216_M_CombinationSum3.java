package com.LeetCodeJack.Problems3;

import java.util.*;

public class P216_M_CombinationSum3 {
    int targetSum;
    int targetSize;
    List<List<Integer>> resList;
    boolean[] visited = new boolean[10];

    public List<List<Integer>> combinationSum3(int k, int n) {
        resList = new ArrayList<>();
        if (k == 0 || n == 0)
            return resList;
        targetSize = k;
        targetSum = n;

        List<Integer> curList = new ArrayList<>();
        sumRecur(0, curList, 1);
        return resList;
    }

    private void sumRecur(int curSum, List<Integer> curList, int start) {
        if (curList.size() == targetSize && curSum == targetSum) {
            resList.add(new ArrayList<>(curList));
            return;
        }

        for (int i = start; i <= 9; i++) {
            if (visited[i] == false) {
                curSum += i;
                curList.add(i);

                sumRecur(curSum, curList, i + 1);

                curSum -= i;
                curList.remove(curList.size() - 1);
            }
        }
    }
}
