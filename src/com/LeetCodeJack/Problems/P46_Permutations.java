package com.LeetCodeJack.Problems;

import java.util.*;

public class P46_Permutations {
    Map<Integer, Integer> visitedIdx =new HashMap<Integer, Integer>();
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> combo = new ArrayList<>();
        if(nums.length == 0)
            return res;
        helperPermute(nums, combo, res);
        return res;
    }
    private void helperPermute(int[] nums, List<Integer> combo,List<List<Integer>> res){
        if(combo.size() == nums.length){
            res.add(new ArrayList<Integer>(combo));
            return;
        }

        for(int i = 0; i < nums.length; i++){

            if(!visitedIdx.containsKey(i)){
                visitedIdx.put(i,nums[i]);
                combo.add(nums[i]);
                helperPermute(nums, combo, res);
                visitedIdx.remove(i);
                combo.remove(combo.size() - 1);
            }else
                continue;
        }
    }
}
