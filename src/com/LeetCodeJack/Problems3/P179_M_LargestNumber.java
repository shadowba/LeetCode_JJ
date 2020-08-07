package com.LeetCodeJack.Problems3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.*;

public class P179_M_LargestNumber {
    public String largestNumber(int[] nums) {
        String[] sNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
            sNums[i] = Integer.toString(nums[i]);

        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                String s1 = str1 + str2;
                String s2 = str2 + str1;
                return s2.compareTo(s1);
            }
        };

        Arrays.sort(sNums, comp);
        if (sNums[0].equals("0"))
            return "0";
        StringBuilder sb = new StringBuilder();
        for (String num : sNums)
            sb.append(num);

        return sb.toString();
    }
}
