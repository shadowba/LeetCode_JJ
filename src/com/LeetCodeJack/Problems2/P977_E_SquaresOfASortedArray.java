package com.LeetCodeJack.Problems2;
import java.util.*;
public class P977_E_SquaresOfASortedArray {
    public int[] sortedSquares(int[] A) {
        if(A== null || A.length == 0)
            return A;
        for(int i = 0; i<A.length; i++)
            A[i] *= A[i];
        Arrays.sort(A);
        return A;
    }
    private void swap(int num1, int num2, int[] A){
        int temp = A[num1];
        A[num1] = A[num2];
        A[num2] = temp;
    }
}
