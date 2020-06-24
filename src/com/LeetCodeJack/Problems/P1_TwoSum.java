package com.LeetCodeJack.Problems;

import java.util.HashMap;

//Given nums=[2,7,11,15],target=9,
//
//        Because nums[0]+nums[1]=2+7=9,
//        return[0,1].

public class P1_TwoSum {
//    private int[] inputArray;
//    private int targetValue;
//    private HashMap<Integer, Integer> inputHash=new HashMap<>();

//    public TwoSum1(int[] array, int value) {
//        inputArray = array.clone();
//        targetValue = value;
//        for (int i = 0; i < inputArray.length; i++) {
//            inputHash.put(inputArray[i], i);
//        }
//    }

//    public int[] getResult() {
//        int[] resultArray = new int[2];
//        int lookForValue;
//        for (int i = 0; i < inputArray.length; i++) {
//            lookForValue = targetValue - inputArray[i];
//            if (inputHash.containsKey(lookForValue)) {
//                resultArray[0] = i;
//                resultArray[1] = inputHash.get(lookForValue);
//                return resultArray;
//            }
//        }
//        return null;
//    }

    public int[] twoSum(int[] nums, int target) {
        int[] inputArray;
        HashMap<Integer, Integer> inputHash = new HashMap<>();

        inputArray = nums.clone();

        for (int i = 0; i < inputArray.length; i++) {
            inputHash.put(inputArray[i], i);
        }

        int[] resultArray = new int[2];
        int lookForValue;
        for (int i = 0; i < inputArray.length; i++) {
            lookForValue = target - inputArray[i];
            if (inputHash.containsKey(lookForValue) && i != inputHash.get(lookForValue)) {
                resultArray[0] = i;
                resultArray[1] = inputHash.get(lookForValue);
                return resultArray;
            }
        }
        return null;
    }

}
