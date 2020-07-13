package com.LeetCode.Tests;

import com.LeetCodeJack.Problems.P658_FindKClosestElements;

public class test658_FindKClosestElements {
    public static void main(String[] args) {
        P658_FindKClosestElements tester = new P658_FindKClosestElements();
        int[] arr = {1,1,1,10,10,10};
        int k = 6;
        int x = 9;
        var res = tester.findClosestElements(arr,k,x);
        System.out.println("END");
    }

}
