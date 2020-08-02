package com.LeetCodeJack.Problems2;

public class P59_M_SpiralMatrix2 {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int top = 0;
        int bot = n - 1;
        int left = 0;
        int right = n - 1;
        int start = 1;
        int i = 0;
        while (top <= bot) {
            i = 0;
            if (left == right && top == bot) {
                res[top][left] = start;
                break;
            }
            for (int num = start; num < start + 4 * (n - 1); num++) {
                if (i == n - 1)
                    i = 0;

                if (start <= num && num <= start + (n - 1) - 1)
                    res[top][left + i] = num;
                else if (start + (n - 1) <= num && num <= start + 2 * (n - 1) - 1)
                    res[top + i][right] = num;
                else if (start + 2 * (n - 1) <= num && num <= start + 3 * (n - 1) - 1)
                    res[bot][right - i] = num;
                else if (start + 3 * (n - 1) <= num && num <= start + 4 * (n - 1) - 1)
                    res[bot - i][left] = num;

                if (i < n - 1)
                    i++;
            }
            start += 4 * (n - 1);
            top++;
            left++;
            bot--;
            right--;
            n -= 2;
        }
        return res;
    }
}
