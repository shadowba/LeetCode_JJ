package com.LeetCodeJack.Problems;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class P30_SubstringWithConcatenationOfAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<Integer>();
        if (s == null || words == null || s.length() == 0 || words.length == 0)
            return result;

        int eachWordL = words[0].length();
        int numberOfWords = words.length;
//        char[] charArr = s.toCharArray();
        Map<String, Integer> wordsMap = new HashMap<>();
        String subStr;

        for (String str : words)
            wordsMap.put(str, wordsMap.getOrDefault(str, 0) + 1);

        for (int i = 0; i <= s.length() - eachWordL * numberOfWords; i++) {
            HashMap<String, Integer> copy = new HashMap<>(wordsMap);
            int j = i;
            int size = numberOfWords;
            while (j < i + eachWordL * numberOfWords) {
                subStr = s.substring(j, j + eachWordL);
                if (!copy.containsKey(subStr) || copy.get(subStr) == 0) {
                    break;
                }
                copy.put(subStr, copy.get(subStr) - 1);
                size--;
                j += eachWordL;
            }
            if (size == 0)
                result.add(i);
        }

        return result;
    }
}
