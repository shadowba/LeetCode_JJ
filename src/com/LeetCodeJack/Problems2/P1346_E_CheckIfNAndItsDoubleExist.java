package com.LeetCodeJack.Problems2;

import java.util.*;

public class P1346_E_CheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        if (arr == null && arr.length == 0)
            return false;
        Set<Integer> numSet = new HashSet<>();
        int numOfZero = 0;
        for (int num : arr) {
            numSet.add(num);
            if (num == 0)
                numOfZero++;
        }
        if (numOfZero >= 2)
            return true;
        for (int num : arr) {
            if (num != 0 && numSet.contains(num * 2))
                return true;
        }
        return false;
    }
}
