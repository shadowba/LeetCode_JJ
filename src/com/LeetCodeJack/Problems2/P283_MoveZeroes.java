package com.LeetCodeJack.Problems2;

public class P283_MoveZeroes {
    public void moveZeroes(int[] nums) {
        int right = nums.length - 1;
        while(right >=0){
            if(nums[right] == 0)
                bubbleUp(nums, right);
            right--;
        }
    }
    private void bubbleUp(int[] nums, int idx){
        while(idx + 1 <= nums.length - 1 && nums[idx + 1] != 0){
            swap(nums, idx, idx + 1);
            idx++;
        }
    }
    private void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
