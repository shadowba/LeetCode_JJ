package com.LeetCodeJack.Problems;

public class P167_TwoSum2InputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int N = numbers.length;

        if(numbers == null || N == 0)
            return res;

        if (N <= 2){
            res[0] = 1;
            res[1] = (N==2)? 2 : 1;
            return res;
        }

        int middle = 0;
        int left = 0;
        int right = 0;
        for (int i = 0; i < N; i++){
//            if(numbers[i] == numbers[i+1] && numbers[i] < target)
//                continue;
            left = i+1;
            right = N -1;

            while(left<=right){
                middle = left + (right - left)/2;
                if(numbers[middle] == target - numbers[i]){
                    res[0] = i+1;
                    res[1] = middle +1;
                    return res;
                }else if(target - numbers[i] > numbers[middle])
                    left = middle + 1;
                else
                    right = middle -1;
            }
        }
        return res;
    }
}
