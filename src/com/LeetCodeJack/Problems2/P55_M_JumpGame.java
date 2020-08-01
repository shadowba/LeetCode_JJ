package com.LeetCodeJack.Problems2;

public class P55_M_JumpGame {
    int N;

    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0)
            return false;
        N = nums.length;
        int curPos = 0;
        int startStep = nums[0];
        for (int i = 0; i < N; i++) {
            if (nums[i] == startStep - i)
                continue;
            curPos = i - 1;
            break;
        }
        return jumper(nums, curPos);
    }

    private boolean jumper(int[] nums, int curPos) {
        if (curPos == N - 1)
            return true;
        int maxStep = nums[curPos];
        if (curPos + maxStep >= N - 1)
            return true;
        for (int i = 1; i <= maxStep; i++) {
            curPos += i;
            if (curPos > N - 1)
                break;
            if (jumper(nums, curPos))
                return true;
            curPos -= i;
        }
        return false;
    }
}
