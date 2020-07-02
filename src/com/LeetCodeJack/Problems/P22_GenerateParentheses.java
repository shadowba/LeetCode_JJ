package com.LeetCodeJack.Problems;

import java.util.List;
import java.util.ArrayList;

public class P22_GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> resultArr = new ArrayList<>();
        parenthesisBackTrack(resultArr, "", 0, 0, n);
        return resultArr;
    }

    private void parenthesisBackTrack(List<String> resultArr, String currentStr, int open, int close, int max) {
        if (currentStr.length() == max * 2) {
            resultArr.add(currentStr);
            return;
        }

        if (open < max)
            parenthesisBackTrack (resultArr, currentStr + '(', open + 1, close, max);
        if (close < open)
            parenthesisBackTrack (resultArr, currentStr + ')', open, close + 1, max);
    }
}
