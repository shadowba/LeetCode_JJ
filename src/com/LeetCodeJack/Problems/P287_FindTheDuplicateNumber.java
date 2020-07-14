package com.LeetCodeJack.Problems;
import java.util.*;
public class P287_FindTheDuplicateNumber {
    Set<Integer> seen = new HashSet<>();
    public int findDuplicate(int[] nums) {
        int target = 0;
        for(int i = 0; i < nums.length; i++){
            if(!seen.contains(nums[i]))
                seen.add(nums[i]);
            else{
                target = i;
                break;
            }
        }
        return nums[target];
    }
}
