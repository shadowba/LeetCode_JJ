package com.LeetCodeJack.Problems;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class P119_PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>(rowIndex);
        if(rowIndex == 0){
            row.add(0,1);
            return row;
        }

        row.add(0,1);
        for (int i = 1; i <= rowIndex; i++) {
            if(i == rowIndex) {
                row.add(rowIndex,1);
                break;
            }
            row.add(i, getRow(rowIndex - 1).get(i) + getRow(rowIndex - 1).get(i - 1));
        }
        return row;
    }
}
