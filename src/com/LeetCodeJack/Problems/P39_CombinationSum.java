package com.LeetCodeJack.Problems;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class P39_CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> member = new ArrayList<>();

        if (candidates.length == 0 || candidates == null)
            return res;

        Arrays.sort(candidates);
        getTarget(candidates, res, member, target, 0);

        return res;
    }

    private void getTarget(int[] candidates, List<List<Integer>> res, List<Integer> member, int target, int Idx) {
        if(target == 0){
            res.add(new ArrayList<Integer>(member));
            return;
        }
        for(int i = Idx; i < candidates.length; i++){
            if(candidates[i] > target)
                break;
            else{
                member.add(candidates[i]);
                getTarget(candidates, res, member, target - candidates[i], i);
                member.remove(member.size()-1);
            }
        }
    }
}
