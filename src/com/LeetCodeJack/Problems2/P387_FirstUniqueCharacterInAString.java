package com.LeetCodeJack.Problems2;

import java.util.*;

public class P387_FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        if(s.length() == 0 || s == null)
            return -1;
        Map<Character, Integer> locationMap = new HashMap<>();
        char[] charArr = s.toCharArray();
        char ch = ' ';
        for (int i = 0; i < s.length(); i++) {
            ch = charArr[i];
            if (!locationMap.containsKey(ch)) {
                locationMap.put(ch, i);
            } else {
                locationMap.put(ch, Integer.MAX_VALUE);
            }
        }
        int location = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : locationMap.entrySet()) {
            location = Math.min(location, entry.getValue());
        }
        return location = (location == Integer.MAX_VALUE) ? -1 : location;
    }
}
