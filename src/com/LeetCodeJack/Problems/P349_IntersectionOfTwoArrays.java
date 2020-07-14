package com.LeetCodeJack.Problems;

import java.util.*;

public class P349_IntersectionOfTwoArrays {
    Set<Integer> num1Set = new HashSet<>();
    Set<Integer> num2Set = new HashSet<>();
    List<Integer> resList = new ArrayList<>();

    public int[] intersection(int[] nums1, int[] nums2) {

        if (nums1.length == 0 || nums1 == null || nums2.length == 0 || nums2 == null)
            return new int[0];

        for (int num : nums1) {
            if (!num1Set.contains(num))
                num1Set.add(num);
            else
                continue;
        }
        for (int num : nums2) {
            if (!num2Set.contains(num))
                num2Set.add(num);
            else
                continue;
        }

        for (int num : num1Set) {
            if (num1Set.contains(num) && num2Set.contains(num))
                resList.add(num);
        }
        int[] resArray = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++) {
            resArray[i] = resList.get(i);
        }
        return resArray;
    }
}
