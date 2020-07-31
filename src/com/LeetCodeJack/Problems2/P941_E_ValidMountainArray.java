package com.LeetCodeJack.Problems2;

public class P941_E_ValidMountainArray {
    public boolean validMountainArray(int[] A) {
        int N = A.length;
        int topIdx = -1;
        for(int i = 0; i <= N - 3; i++){
            if(A[i] < A[i+1]){
                if(A[i+1]>A[i] && A[i+1] > A[i+2]){
                    topIdx = i+1;
                    break;
                }
            }else
                return false;
        }
        if(topIdx == -1) return false;
        for(int j = topIdx; j <= N-2; j++){
            if(A[j]<=A[j+1])
                return false;
        }
        return true;
    }
}
