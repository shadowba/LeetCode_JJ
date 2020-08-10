package com.LeetCodeJack.Problems3;

public class P223_M_RectangleArea {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area1 = (C - A) * (D - B);
        int area2 = (G - E) * (H - F);

        int left = Math.max(A, E);
        int right = Math.min(C, G);
        int top = Math.min(H, D);
        int bot = Math.max(B, F);
        int overLap = 0;
        if (right > left && top > bot) {
            overLap = (right - left) * (top - bot);
        }
        return area1 + area2 - overLap;
    }
}
