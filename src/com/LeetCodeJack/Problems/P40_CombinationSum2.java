package com.LeetCodeJack.Problems;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class P40_CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> member = new ArrayList<>();

        if (candidates.length == 0 || candidates == null)
            return res;

        Arrays.sort(candidates);
        getTarget(candidates, res, member, target, 0);

        return res;
    }

    private void getTarget(int[] candidates, List<List<Integer>> res, List<Integer> member, int target, int Idx) {
        if (target == 0) {
            res.add(new ArrayList<>(member));
            return;
        }
        for (int i = Idx; i < candidates.length; i++) {
            if (i != Idx && candidates[i] == candidates[i - 1])
                continue;
            if (candidates[i] > target) {
                break;
            } else {
                member.add(candidates[i]);
                getTarget(candidates, res, member, target - candidates[i], i + 1);
                member.remove(member.size() - 1);
            }
        }
    }
}
