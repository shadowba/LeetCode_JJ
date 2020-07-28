package com.LeetCodeJack.Problems2;

public class P494_M_TargetSum {
    int res = 0;
    public int findTargetSumWays(int[] nums, int S) {
        helperSum(nums,0,S,0);
        return res;
    }
    private void helperSum(int[] nums, int idx, int S, int sum){
        if(idx == nums.length - 1){
            if(sum + nums[idx] == S) res++;
            if(sum - nums[idx] == S) res++;
            return;
        }

        helperSum(nums, idx+1, S, sum + nums[idx]);
        helperSum(nums, idx+1, S, sum - nums[idx]);
    }
}
