package com.LeetCodeJack.Problems2;

import java.util.*;

public class P733_E_FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        Set<List<Integer>> corSet = new HashSet<>();

        Queue<Integer> rowQue = new LinkedList<>();
        Queue<Integer> colQue = new LinkedList<>();
        rowQue.offer(sr);
        colQue.offer(sc);
        corSet.add(List.of(sr, sc));
        int size = 0;
        int row = 0;
        int col = 0;
        int oldColor = image[sr][sc];
        while (!rowQue.isEmpty()) {
            size = rowQue.size();
            while (size > 0) {
                row = rowQue.poll();
                col = colQue.poll();
                image[row][col] = newColor;
                imageFill(image, row, col, rowQue, colQue, oldColor, corSet);
                size--;
            }
        }
        return image;
    }

    private void imageFill(int[][] image, int row, int col, Queue<Integer> rowQ, Queue<Integer> colQ, int oldColor, Set<List<Integer>> corSet) {
        if (row - 1 >= 0 && image[row - 1][col] == oldColor && !corSet.contains(List.of(row - 1, col))) {
            rowQ.offer(row - 1);
            colQ.offer(col);
            corSet.add(List.of(row - 1, col));
        }
        if (col - 1 >= 0 && image[row][col - 1] == oldColor && !corSet.contains(List.of(row, col - 1))) {
            rowQ.offer(row);
            colQ.offer(col - 1);
            corSet.add(List.of(row, col - 1));
        }
        if (col + 1 <= image[0].length - 1 && image[row][col + 1] == oldColor && !corSet.contains(List.of(row, col + 1))) {
            rowQ.offer(row);
            colQ.offer(col + 1);
            corSet.add(List.of(row, col + 1));
        }
        if (row + 1 <= image.length - 1 && image[row + 1][col] == oldColor && !corSet.contains(List.of(row + 1, col))) {
            rowQ.offer(row + 1);
            colQ.offer(col);
            corSet.add(List.of(row + 1, col));
        }
    }

}
