package com.LeetCodeJack.Problems2;

public class P1089_E_DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            if (i <= N - 2 && arr[i] == 0) {
                for (int j = N - 1; j >= i + 1; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[i] = 0;
                i++;
            }
        }
    }
}
