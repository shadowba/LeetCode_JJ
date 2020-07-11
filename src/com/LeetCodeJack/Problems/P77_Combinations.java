package com.LeetCodeJack.Problems;

import java.util.ArrayList;
import java.util.List;

public class P77_Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> combine = new ArrayList<>();
        helperCombine(n, k, 1, k, combine, res);
        return res;
    }

    private void helperCombine(int n, int k, int curStart, int curLeft, List<Integer> combine, List<List<Integer>> res) {
        if (curLeft == 0) {
            res.add(new ArrayList<>(combine));
            return;
        }

        for (int i = curStart; i <= n; i++) {
            combine.add(i);
            helperCombine(n, k, i + 1, curLeft - 1, combine, res);
            combine.remove(combine.size() - 1);
        }
    }
}
