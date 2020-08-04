package com.LeetCodeJack.Problems2;

import java.util.*;

public class P93_M_RestoreIPAddresses {
    List<String> resList;
    int N;

    public List<String> restoreIpAddresses(String s) {
        N = s.length();
        resList = new ArrayList<>();
        if (N > 12 || N < 4)
            return resList;
        searchDfs(s, 0, "", 0);
        return resList;
    }

    private void searchDfs(String s, int pos, String cur, int slot) {
        if (slot == 4 && pos == N) {
            resList.add(cur);
            return;
        }

        for (int i = 1; i <= 3; i++) {
            if (pos + i > N)
                break;
            String section = s.substring(pos, pos + i);
            if (( section.startsWith("0")&&section.length() > 1) || Integer.parseInt(section) > 255)
                break;
            searchDfs(s, pos + i, (slot == 0) ? section : cur + "." + section, slot+1);
        }
    }
}
