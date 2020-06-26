package com.LeetCode.Tests;

import com.LeetCodeJack.Problems.P11_ContainerWithMostWater;

public class test11_ContainerWithMostWater {
    public static void main(String[] args) {
        int[] input={1,8,6,2,5,4,8,3,7};
        P11_ContainerWithMostWater container= new P11_ContainerWithMostWater();
        System.out.println(container.maxArea(input));
        System.out.println("END");
    }
}
