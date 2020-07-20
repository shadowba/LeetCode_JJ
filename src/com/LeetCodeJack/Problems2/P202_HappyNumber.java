package com.LeetCodeJack.Problems2;

import java.util.HashSet;

public class P202_HappyNumber {
    HashSet<Integer> hashSet = new HashSet<>();
    public boolean isHappy(int n) {
        while (!hashSet.contains(n)) {
            hashSet.add(n);
            n = helperNumber(n);
            if(n == 1)
                return true;
        }
        return false;
    }

    private int helperNumber(int n) {
        int res = 0;
        while (n != 0) {
            res += (n % 10)*(n % 10);
            n /= 10;
        }
        return res;
    }
}
