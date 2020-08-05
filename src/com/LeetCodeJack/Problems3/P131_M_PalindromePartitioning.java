package com.LeetCodeJack.Problems3;
import java.util.*;
public class P131_M_PalindromePartitioning {
    List<List<String>> resList;
    int N;

    public List<List<String>> partition(String s) {
        resList = new ArrayList<>();
        N = s.length();
        List<String> curList = new ArrayList<>();
        helperDFS(s, 0, curList);
        return resList;
    }

    private void helperDFS(String s, int idx, List<String> curList) {
        if (idx == N) {
            resList.add(new ArrayList<>(curList));
            return;
        }
        String sub;
        for (int i = 1; i <= N - idx; i++) {
            sub = s.substring(idx, idx + i);
            if (isValid(sub)) {
                curList.add(sub);
                helperDFS(s, idx + i, curList);
                curList.remove(curList.size() - 1);
            }
        }
    }

    private boolean isValid(String s) {
        int length = s.length();
        if (length == 1)
            return true;
        int left = 0;
        int right = length - 1;
        int middle = left + (right - left) / 2;
        if (length % 2 == 1) {
            while (left < middle) {
                if (s.charAt(left) != s.charAt(right))
                    return false;
                left++;
                right--;
            }
        } else {
            while (left < right) {
                if (s.charAt(left) != s.charAt(right))
                    return false;
                left++;
                right--;
            }
        }
        return true;
    }
}
