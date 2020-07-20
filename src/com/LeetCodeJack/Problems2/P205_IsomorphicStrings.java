package com.LeetCodeJack.Problems2;

import java.util.*;

public class P205_IsomorphicStrings {
    Map<Character, Integer> sMap = new HashMap<>();
    Map<Character, Integer> tMap = new HashMap<>();

    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length() != t.length())
            return false;

        if( s.length() == 0 && t.length() == 0)
            return true;

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (!sMap.containsKey(sChar[i]) && !tMap.containsKey(tChar[i])) {
                sMap.put(sChar[i], i);
                tMap.put(tChar[i], i);
            } else {
                if (sMap.get(sChar[i]) != tMap.get(tChar[i]))
                    return false;
            }
        }
        return true;
    }
}
