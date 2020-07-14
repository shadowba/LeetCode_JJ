package com.LeetCodeJack.Problems;

import java.util.*;

public class P350_IntersectionOfTwoArrays2 {
    Map<Integer, Integer> nums2Map = new HashMap<>();
    List<Integer> resList = new ArrayList<>();

    public int[] intersect(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        if (n2 < n1)
            return intersect(nums2, nums1);

        for (int i = 0; i <= nums2.length - 1; i++) {
            nums2Map.put(nums2[i], nums2Map.getOrDefault(nums2[i], 0) + 1);
        }

        for (int i = 0; i <= nums1.length - 1; i++) {
            if (nums2Map.containsKey(nums1[i]) && nums2Map.get(nums1[i]) != 0) {
                resList.add(nums1[i]);
                nums2Map.replace(nums1[i], nums2Map.get(nums1[i]) - 1);
            }
        }
        int[] res = new int[resList.size()];
        for (int i = 0; i<res.length; i++)
            res[i] = resList.get(i);
        return res;
    }

//    private int binarySearch(int[] nums, int target) {
//        int left = 0;
//        int right = nums.length - 1;
//        int mid;
//        while (left <= right) {
//            mid = left + (right - left) / 2;
//            if (nums[mid] == target)
//                return mid;
//            else if (nums[mid] < target)
//                left = mid + 1;
//            else
//                right = mid - 1;
//        }
//        return -1;
//    }
}
