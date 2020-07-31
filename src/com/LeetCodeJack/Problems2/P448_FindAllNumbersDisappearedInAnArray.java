package com.LeetCodeJack.Problems2;

import java.util.*;

public class P448_FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if(nums == null || nums.length == 0)
            return res;
        int n = nums.length;
        Set<Integer> numSet= new HashSet<>();
        int numOfMissing= 0;
        for(int num: nums){
            if (numSet.contains(num))
                numOfMissing++;
            numSet.add(num);
        }
        for(int i = 1; i <= n; i++){
            if(!numSet.contains(i) && numOfMissing != 0){
                res.add(i);
                if(--numOfMissing == 0)
                    break;
            }
        }
        return res;
    }
}
