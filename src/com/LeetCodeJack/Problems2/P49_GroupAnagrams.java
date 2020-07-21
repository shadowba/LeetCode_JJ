package com.LeetCodeJack.Problems2;

import java.util.*;

public class P49_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if(strs.length == 0|| strs == null)
            return res;
        Map<String, List<String>> anagramsMap = new HashMap<>();

        char[] chArr = new char[26];
        String tempStr;

        for (String str : strs) {
            chArr = str.toCharArray();
            Arrays.sort(chArr);
//            for (char ch : str.toCharArray())
//                chArr[ch - 'a']++;
            tempStr = String.valueOf(chArr);
            System.out.println(tempStr);

            if (!anagramsMap.containsKey(tempStr))
                anagramsMap.put(tempStr, new ArrayList<String>());
            anagramsMap.get(tempStr).add(str);
        }

        for (Map.Entry<String, List<String>> entry : anagramsMap.entrySet())
            res.add(entry.getValue());
        return res;
    }
}
