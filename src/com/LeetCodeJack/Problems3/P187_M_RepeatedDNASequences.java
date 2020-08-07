package com.LeetCodeJack.Problems3;

import java.util.*;

public class P187_M_RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> resList = new ArrayList<>();
        if (s.length() == 0 || s.length() == 10 || s == null)
            return resList;

        Set<String> stringSet = new HashSet<>();
        Set<String> visited = new HashSet<>();
        int N = s.length();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= N - 10; i++) {
            String DNA = s.substring(i, i + 10);
            if (!stringSet.contains(DNA))
                stringSet.add(DNA);
            else {
                if (!visited.contains(DNA)) {
                    resList.add(DNA);
                    visited.add(DNA);
                }
            }
        }
        return resList;
    }
}
