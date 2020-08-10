package com.LeetCodeJack.Problems3;

public class P238_M_ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int[] res = new int[N];
        int[] fwd = new int[N];

        fwd[0] = 1;
        for (int i = 1; i < N; i++) {
            fwd[i] = nums[i - 1] * fwd[i - 1];
        }
        res[N - 1] = 1;
        int right = 1;
        for (int i = N - 1; i >= 0; i--) {
            res[i] = fwd[i] * right;
            right *= nums[i];
        }
        return res;
    }
}
