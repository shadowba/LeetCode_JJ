package com.LeetCodeJack.Problems;

import java.util.*;

public class P15_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = 0;
        int target = 0;
        int total = 0;
        List<Integer> targetArray = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            target = 0 - nums[i];
            left = i + 1;
            right = nums.length - 1;
            while (left < right && left >= 0 && right < nums.length) {
                total = nums[left] + nums[right];

                if (total < target) {
                    left++;
                } else if (total > target) {
                    right--;
                } else {
                    targetArray = Arrays.asList(nums[i], nums[left], nums[right]);
                    result.add(targetArray);
                    while (left < right && nums[left] == nums[left + 1])
                        left++;
                    while (left < right && nums[right] == nums[right - 1])
                        right--;
                    left++;
//                    right--;
                    right = nums.length - 1;
                }
            }
        }
        return result;
    }
}

//    public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> finalList = new ArrayList<>();
//        List<Integer> resultList = new ArrayList<>();
//        int target = 0;
//        int[] resultArray = new int[3];
//
//        for (int i = 0; i < nums.length; i++) {
//
//
//            if (twoSum(nums, i, -nums[i], resultArray)) {
//                resultArray[0] = nums[i];
//                Arrays.sort(resultArray);
//
//                resultList = Arrays.asList(resultArray[0], resultArray[1], resultArray[2]);
//                if (!resultList.equals(finalList.get(finalList.size() - 1))) {
//                    finalList.add(resultList);
//                }
//
//            }
//
//        }
//
//        return finalList;
//    }

//
//    private boolean twoSum(int[] inputNums, int index, int target, int[] resultArray) {
//        Map<Integer, Integer> indexMap = new HashMap<>();
//        for (int i = 0; i < inputNums.length; i++) {
//            if (i == index)
//                continue;
//            indexMap.put(inputNums[i], i);
//        }
//
//        for (int j = 0; j < inputNums.length; j++) {
//            if (j == index)
//                continue;
//
//            if (indexMap.containsKey(target - inputNums[j])) {
//                resultArray[1]=inputNums[j];
//                resultArray[2]=target - inputNums[j];
////                outputNums.add(1, inputNums[j]);
////                outputNums.add(2, target - inputNums[j]);
//                return true;
//            }
//        }
//
//        return false;
//    }

