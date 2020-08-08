package com.LeetCodeJack.Problems3;
//        和198的劫匪题变形，变通处在于如果有n个房子，如果抢了第1个房子，因为与n相邻就绝不能抢n号房，如果抢了n号房，就绝不能抢1号房
public class P213_M_HouseRobber2 {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        int N = nums.length;
        int[] money = new int[N];

        int start = 0;
        money[0] = 0;
        money[1] = nums[start];
        for(int i = 2; i<N; i++){
            money[i]=Math.max(money[i-1],money[i-2]+nums[i-1]);
        }
        int max = money[N-1];

        start = 1;
        money[1] = nums[start];
        for(int i = 2; i<N;i++){
            money[i]=Math.max(money[i-1], money[i-2]+nums[i]);
        }
        return Math.max(max, money[N-1]);
    }
}
