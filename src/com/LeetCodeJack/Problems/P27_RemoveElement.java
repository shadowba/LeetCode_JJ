package com.LeetCodeJack.Problems;

public class P27_RemoveElement {
    public int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0)
            return 0;

        int left = 0;
        int right = 0;
        int result = 0;
        int lastIndex = 0;

        while (right < nums.length){
            if(nums[right] != val){
                result++;
                nums[lastIndex++] = nums[right++];
            }else{
                right++;
            }
        }

        return result;
    }
}
