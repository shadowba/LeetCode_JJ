package com.LeetCodeJack.Problems;

public class P779_KthSymbolInGrammar {
    public int kthGrammar(int N, int K) {
        if (N == 1)
            return 1;

        if (K % 2 == 1)
            return kthGrammar(N - 1, (K + 1) / 2);
        else
            return (kthGrammar(N - 1, (K + 1) / 2) == 0) ? 1 : 0;
    }
}
