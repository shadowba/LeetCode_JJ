package com.LeetCodeJack.Problems;

public class P240_SearchA2DMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0)
            return false;
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;

        int i = m;
        int j = 0;

        while (i >= 0 && j <= n) {
            if (target < matrix[i][j]) {
                i--;
            } else if (target > matrix[i][j]) {
                j++;
            } else {
                return true;
            }
        }

        return false;
    }
}

//    public boolean searchMatrix(int[][] matrix, int target) {
//        if (matrix == null)
//            return false;
//
//        return helperSearch(matrix, 0, 0, matrix[0].length, matrix.length, target);
//    }
//
//    private boolean helperSearch(int[][] matrix, int lowX, int lowY, int highX, int highY, int target) {
//        if (lowX == highX && lowY == highY) {
//            return matrix[lowX][lowY] == target;
//        }
//
//        int m = highX - lowX + 1;
//        int n = highY - lowY + 1;
//        int pivotCol = findColIdx(matrix[lowX], lowX, m, target);
//        int pivotRow = findRowIdx(matrix, pivotCol, lowY, n, target);
//        if (target == matrix[pivotRow][pivotCol]) {
//            return true;
//        } else if (target > matrix[pivotRow][pivotCol]) {
//            return helperSearch(matrix, pivotRow, pivotRow, highX, highY, target);
//        } else
//            return helperSearch(matrix, lowX, lowY, pivotRow, pivotCol, target);
////        return false;
//    }
//
//    private int findColIdx(int[] row, int low, int high, int target) {
//        int left = low;
//        int right = high;
//        int middle = low + (high - low) / 2;
//        while (left < right) {
//            if (row[middle] == target)
//                return middle;
//            else if (target < row[middle])
//                right = middle - 1;
//            else
//                left = middle + 1;
//        }
//        return middle;
//    }
//
//    private int findRowIdx(int[][] matrix, int j, int low, int high, int target) {
//        int top = high;
//        int bot = low;
//        int middle = low + (high - low) / 2;
//        while (bot < top) {
//            if (matrix[middle][j] == target)
//                return middle;
//            else if (target < matrix[middle][j])
//                top = middle - 1;
//            else
//                bot = middle + 1;
//        }
//        return middle;
//    }