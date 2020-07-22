package com.LeetCodeJack.Problems2;

import java.util.*;

public class P118_PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resList = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        if (numRows == 0)
            return resList;

        tempList.add(1);
        resList.add(new ArrayList<>(tempList));

        if (numRows == 1)
            return resList;
        int size;
        List<Integer> prevList = tempList;
        for (int i = 1; i < numRows; i++) {
            tempList.clear();

            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    tempList.add(1);
                    continue;
                }
                tempList.add(prevList.get(j - 1) + prevList.get(j));
            }

            prevList = new ArrayList<>(tempList);
            resList.add(prevList);
        }
        return resList;
    }
}
