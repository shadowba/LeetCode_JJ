package com.LeetCodeJack.Problems3;

import java.util.*;

public class P229_M_MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> resList = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return resList;
        int a = 0;
        int b = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        //  出现次数 > n/3的数最多只有两个，最少0个
        //  先用Moore Voting选出出现次数最多的两个数，再遍历看哪几个数是有效的
        for (int num : nums) {
            if (num == a)
                cnt1++;
            else if (num == b)
                cnt2++;
            else if (cnt1 == 0) {
                a = num;
                cnt1 = 1;
            } else if (cnt2 == 0) {
                b = num;
                cnt2 = 1;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;
        for (int num : nums) {
            if (num == a)
                cnt1++;
            else if (num == b)
                cnt2++;
        }
        if (cnt1 > nums.length / 3) resList.add(a);
        if (cnt2 > nums.length / 3) resList.add(b);
        return resList;
    }
}
