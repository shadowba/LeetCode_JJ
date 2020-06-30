package com.LeetCodeJack.Problems;

import java.util.HashSet;
import java.util.Set;

public class P14_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int minLength = Integer.MAX_VALUE;
        StringBuilder result = new StringBuilder();

        if (strs.length == 0 || strs == null)
            return "";

        for (String str : strs) {
            minLength = Math.min(minLength, str.length());
            if (minLength == 0)
                return "";
        }

        if (strs.length == 1)
            return strs[0];

        boolean breakFlag = false;
        for (int i = 0; i < minLength; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != strs[j - 1].charAt(i))
                    breakFlag = true;
                if (breakFlag)
                    break;
            }
            if (breakFlag)
                break;
            result.append(strs[0].charAt(i));
        }

        return result.toString();
    }
}
