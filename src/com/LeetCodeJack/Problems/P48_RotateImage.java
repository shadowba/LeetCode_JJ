package com.LeetCodeJack.Problems;

public class P48_RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int top = 0;
        int left = 0;
        int bot = n - 1;
        int right = n - 1;
        int temp = 0;
        while (n > 1) {
            for (int i = 0; i < n - 1; i++) {
                temp = matrix[top][left + i];
                matrix[top][left + i] = matrix[bot - i][left];
                matrix[bot - i][left] = matrix[bot][right - i];
                matrix[bot][right - i] = matrix[top + i][right];
                matrix[top + i][right] = temp;
            }
            top++;
            left++;
            bot--;
            right--;
            n -= 2;
        }
    }
}
