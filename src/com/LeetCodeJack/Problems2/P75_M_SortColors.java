package com.LeetCodeJack.Problems2;

import java.util.*;

public class P75_M_SortColors {
    public void sortColors(int[] nums) {
        int p1 = 0;
        int p2 = nums.length - 1;
        int idx = 0;
        while(nums[p1] == 0 && p1 < nums.length -1)
            p1++;
        while(nums[p2] == 2 && p2 > 0 )
            p2--;
        idx = p1;
        while(idx < p2){
            if(nums[idx]==0){
                nums[idx] = nums[p1];
                nums[p1] = 0;
                p1++;
            }
            if(nums[idx] == 2){
                nums[idx] = nums[p2];
                nums[p2] = 2;
                p2--;
                idx--;
            }
            idx++;
        }
    }
}

// 2-pass Method, counting sort
//    public void sortColors(int[] nums) {
//        Map<Integer, Integer> numMap = new HashMap<>();
//        for (int num : nums)
//            numMap.put(num, numMap.getOrDefault(num, 0) + 1);
//        int start = 0;
//
//        for (int i = 0; i < 3; i++) {
//            if (numMap.containsKey(i)) {
//                for (int j = start; j < start + numMap.get(i); j++)
//                    nums[j] = i;
//                if (i < 2) start += numMap.get(i);
//            }
//        }
//    }
