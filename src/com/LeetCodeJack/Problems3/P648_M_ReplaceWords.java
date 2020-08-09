package com.LeetCodeJack.Problems3;

import java.util.*;

public class P648_M_ReplaceWords {
    public String replaceWords(List<String> dict, String sentence) {
        Map<Integer, Set<String>> map = new HashMap<>();
        for (String str : dict) {
            if (!map.containsKey(str.length()))
                map.put(str.length(), new HashSet<>());
            map.get(str.length()).add(str);
        }
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            for (Integer key : map.keySet()) {
                if (words[i].length() >= key && map.get(key).contains(words[i].substring(0, key)))
                    words[i] = words[i].substring(0, key);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word + " ");
        }
        sb.delete(sb.length() - 1, sb.length());
        return sb.toString();
    }
}
