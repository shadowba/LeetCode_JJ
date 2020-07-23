package com.LeetCodeJack.Problems2;

public class P189_RotateArray {
    public void rotate(int[] nums, int k) {
        int N = nums.length;
        int temp;
        while (k > 0) {
            temp = nums[N - 1];
            for (int i = N - 1; i >= 1; i--)
                nums[i] = nums[i - 1];
            nums[0] = temp;
            k--;
        }
    }
}
