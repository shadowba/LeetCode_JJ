package com.LeetCodeJack.Problems;

public class P26_RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
//         int i=0;
//         int result = 1;

//         if(nums == null || nums.length == 0)
//             return 0;

//         while(i < nums.length -1){
//             if(nums[i] == nums[i+1])
//                 i++;
//             result++;
//             i++;
//         }

        int result = 1;

        if (nums == null || nums.length == 0)
            return 0;

        int left = 0;
        int right = 0;
        int lastIndex = 0;
        while (right < nums.length) {
            if (nums[left] == nums[right]) {
                right++;
                continue;
            }
            result++;
            nums[++lastIndex] = nums[right];
            left = right;
        }

        return result;
    }
}
