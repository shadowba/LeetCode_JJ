package com.LeetCode.Tests;

import com.LeetCodeJack.Problems2.P733_E_FloodFill;

public class test733_FloodFill {
    public static void main(String[] args) {
        var tester = new P733_E_FloodFill();
        int[][] image = {{0,0,0},{0,1,1}};
        int sr = 1;
        int sc = 1;
        int newColor = 1;
        tester.floodFill(image,sr,sc, newColor);
    }
}
