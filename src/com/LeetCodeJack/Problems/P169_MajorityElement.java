package com.LeetCodeJack.Problems;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class P169_MajorityElement {
    //     --- Fastest Method by Sorting ---
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

//      --- Normal Method by HashMap ---
//    public int majorityElement(int[] nums) {
//        int maxN = nums.length/2;
//        int res = 0;
//        Map<Integer, Integer> numsMap = new HashMap<>();
//        numsMap = loadElements(nums);
//        for (int key: numsMap.keySet()){
//            if (numsMap.get(key)>maxN){
//                maxN = Math.max(numsMap.get(key), maxN);
//                res = key;
//            }
//        }
//        return res;
//    }
//
//    private Map<Integer, Integer> loadElements(int[] nums) {
//        Map<Integer, Integer> numsMap = new HashMap<>();
//        for (int n : nums) {
//            numsMap.put(n, numsMap.getOrDefault(n, 0) + 1);
//        }
//        return numsMap;
//    }
}
