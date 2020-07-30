package com.LeetCodeJack.Problems2;
import java.util.*;
public class P542_M_01Matrix {
    public int[][] updateMatrix(int[][] matrix) {
        int rowN = matrix.length;
        int colN = matrix[0].length;
        int[][] resMatrix = new int[rowN][colN];
        Stack<Integer> rowStack = new Stack<>();
        Stack<Integer> colStack = new Stack<>();
        Stack<Integer> tempRowStack = new Stack<>();
        Stack<Integer> tempColStack = new Stack<>();

        for (int i = 0; i < rowN; i++) {
            for (int j = 0; j < colN; j++) {
                if (matrix[i][j] == 0) continue;
                else {
                    if (isNextToWater(i, j, matrix))
                        resMatrix[i][j] = 1;
                    else {
                        rowStack.push(i);
                        colStack.push(j);
                        resMatrix[i][j] = Integer.MAX_VALUE;
                    }
                }
            }
        }
        int row = 0;
        int col = 0;
        int minLength = 0;
        int des = 1;
        while (!rowStack.isEmpty()) {

            while (!rowStack.isEmpty()) {
                row = rowStack.pop();
                col = colStack.pop();
                minLength = getMinLength(row, col, resMatrix);
                if (minLength != des) {
                    tempRowStack.push(row);
                    tempColStack.push(col);
                } else {
                    resMatrix[row][col] = minLength + 1;
                }
            }

            while (!tempRowStack.isEmpty()) {
                rowStack.push(tempRowStack.pop());
                colStack.push(tempColStack.pop());
            }
            des++;
        }
        return resMatrix;
    }

    private boolean isNextToWater(int rIdx, int cIdx, int[][] matrix) {
        if (rIdx - 1 >= 0 && matrix[rIdx - 1][cIdx] == 0) return true;
        if (cIdx - 1 >= 0 && matrix[rIdx][cIdx - 1] == 0) return true;
        if (rIdx + 1 <= matrix.length - 1 && matrix[rIdx + 1][cIdx] == 0) return true;
        if (cIdx + 1 <= matrix[0].length - 1 && matrix[rIdx][cIdx + 1] == 0) return true;
        return false;
    }

    private int getMinLength(int rIdx, int cIdx, int[][] resMatrix) {
        int minLength = Integer.MAX_VALUE;
        if (rIdx - 1 >= 0) minLength = Math.min(minLength, resMatrix[rIdx - 1][cIdx]);
        if (cIdx - 1 >= 0) minLength = Math.min(minLength, resMatrix[rIdx][cIdx - 1]);
        if (rIdx + 1 <= resMatrix.length - 1) minLength = Math.min(minLength, resMatrix[rIdx + 1][cIdx]);
        if (cIdx + 1 <= resMatrix[0].length - 1) minLength = Math.min(minLength, resMatrix[rIdx][cIdx + 1]);
        return minLength;
    }
}
