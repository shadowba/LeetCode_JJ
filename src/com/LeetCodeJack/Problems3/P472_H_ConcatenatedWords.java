package com.LeetCodeJack.Problems3;

import java.util.*;

public class P472_H_ConcatenatedWords {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> resList = new ArrayList<>();
        Set<String> dict = new HashSet<>();

        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });
        for (String str : words) {
            if (helper(str, dict, new HashMap<>()))
                resList.add(str);
            else
                dict.add(str);
        }
        return resList;
    }

    public boolean helper(String s, Set<String> dict, Map<String, Boolean> memory) {
        if (memory.containsKey(s))
            return memory.get(s);

        if (dict.contains(s)) {
            memory.put(s, true);
            return true;
        }

        for (int i = 1; i <= s.length(); i++) {
            String left = s.substring(0, i);
            String right = s.substring(i);
            if (dict.contains(left) && helper(right, dict, memory)) {
                memory.put(s, true);
                return true;
            }
        }
        memory.put(s, false);
        return false;
    }
}
