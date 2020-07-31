package com.LeetCodeJack.Problems2;

public class P1299_E_ReplaceElementsWithGreatestElementOnRightSide {
    public int[] replaceElements(int[] arr) {
        if(arr == null || arr.length == 0)
            return arr;
        int N = arr.length;
        for(int i = 0; i < N -1; i++)
            arr[i] = getMax(arr, i);
        arr[N-1] = -1;
        return arr;
    }
    private int getMax(int[] arr, int idx){
        int N = arr.length;
        int max = 0;
        for(int i = idx+1; i<N; i++)
            max = Math.max(arr[i], max);
        return max;
    }
}
