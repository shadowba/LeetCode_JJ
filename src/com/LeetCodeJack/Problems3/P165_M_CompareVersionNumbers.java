package com.LeetCodeJack.Problems3;

public class P165_M_CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        String[] v1Arr = version1.split("\\.");
        String[] v2Arr = version2.split("\\.");
        int maxL = Math.max(v1Arr.length, v2Arr.length);
        int[] v1 = new int[maxL];
        int[] v2 = new int[maxL];
        for(int i = 0; i<v1Arr.length; i++){
            v1[i] = Integer.valueOf(v1Arr[i]);
        }
        for(int i = 0; i<v2Arr.length; i++){
            v2[i] = Integer.valueOf(v2Arr[i]);
        }
        for(int i = 0; i < maxL; i++){
            if(v1[i] - v2[i] > 0)
                return 1;
            else if(v1[i] - v2[i] < 0)
                return -1;
        }
        return 0;
    }
}
