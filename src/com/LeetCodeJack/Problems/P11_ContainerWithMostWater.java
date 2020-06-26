package com.LeetCodeJack.Problems;

public class P11_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int bottom = 0;
        int maxArea = 0;

        while (j - i > 0) {
            bottom = j - i;
            maxArea = Math.max(maxArea, bottom * Math.min(height[i], height[j]));
            if (height[j] > height[i])
                i++;
            else
                j--;
        }
        return maxArea;
    }
}
