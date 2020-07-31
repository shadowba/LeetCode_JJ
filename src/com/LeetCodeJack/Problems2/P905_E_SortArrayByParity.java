package com.LeetCodeJack.Problems2;

public class P905_E_SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        if (A == null || A.length == 0)
            return A;
        int N = A.length;
        int left = 0;
        int right = N - 1;
        while (left < right) {
            if (A[left] % 2 > A[right] % 2)
                swap(A, left, right);
            if (A[left] % 2 == 0) left++;
            if (A[right] % 2 == 1) right--;
        }
        return A;
    }

    private void swap(int[] A, int idx1, int idx2) {
        int temp = A[idx1];
        A[idx1] = A[idx2];
        A[idx2] = temp;
    }
}
