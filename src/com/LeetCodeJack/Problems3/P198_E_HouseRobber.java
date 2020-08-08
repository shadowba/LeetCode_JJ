package com.LeetCodeJack.Problems3;

public class P198_E_HouseRobber {
    public int rob(int[] nums) {
        if(nums == null || nums.length ==0)
            return 0;
        int[] money =new int[nums.length + 1];
        money[0] = 0;
        money[1] = nums[0];
        int max = 0;
        for(int i =2; i<nums.length+1; i++){
            money[i] = Math.max(money[i-1], money[i-2]+nums[i-1]);
        }
        return money[money.length-1];
    }
}
