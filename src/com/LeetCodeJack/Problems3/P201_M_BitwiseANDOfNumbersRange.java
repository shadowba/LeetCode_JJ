package com.LeetCodeJack.Problems3;

public class P201_M_BitwiseANDOfNumbersRange {
    public int rangeBitwiseAnd(int m, int n) {
        if(m == 0)
            return 0;
        if(m == n)
            return m;

        int N = n - m + 1;
        int prev = m;
        int cur = m;
        int max = 1073741824;

        while(max > 0){
            if(max >=m && max <= n){
                return (max & m);
            }
            max /=2;
        }
        for (int i = 1; i < N; i++) {
            cur = (m+i) & prev;
            prev = cur;
        }
        return cur;
    }
}
