package com.LeetCodeJack.Problems2;

public class P96_M_UniqueBinarySearchTrees {
    //    https://www.youtube.com/watch?v=-rlQCg_TJac
    public int numTrees(int n) {
        if (n <= 1)
            return 1;
        int val = 0;
        for (int i = 1; i <= n; i++) {
            val += numTrees(i - 1) * numTrees(n - i);
        }
        return val;
    }
}
