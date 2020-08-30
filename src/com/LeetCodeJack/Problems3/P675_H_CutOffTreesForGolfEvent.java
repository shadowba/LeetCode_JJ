package com.LeetCodeJack.Problems3;

import java.util.*;

public class P675_H_CutOffTreesForGolfEvent {
    int m_;
    int n_;

    public int cutOffTree(List<List<Integer>> forest) {
        m_ = forest.size();
        n_ = forest.get(0).size();
        List<int[]> treesHeight = getAllTreeHights(forest);
        Collections.sort(treesHeight,(int[] a, int[] b)-> (a[2]-b[2]));
        int minSteps=0;
        int curX=0;
        int curY=0;
        while(!treesHeight.isEmpty()){
            int[] curTree = treesHeight.remove(0);
            int step=distanceBFS(forest,curX,curY,curTree[0],curTree[1]);
            if(step==-1)
                return -1;
            minSteps+=step;
            curX=curTree[0];
            curY=curTree[1];
            forest.get(curY).set(curX,1);
        }
        return minSteps;
    }

    private int distanceBFS(List<List<Integer>> forest, int sx, int sy, int tx, int ty) {
        boolean[][] visited = new boolean[m_][n_];
        int[] dirX = {1, 0, -1, 0};
        int[] dirY = {0, 1, 0, -1};
        Queue<Integer> xq = new LinkedList<>();
        Queue<Integer> yq = new LinkedList<>();
        xq.offer(sx);
        yq.offer(sy);
        int size = 0;
        int step = 0;
        int curX = 0;
        int curY = 0;
        while (!xq.isEmpty()) {
            size = xq.size();
            while (size > 0) {
                curX = xq.poll();
                curY = yq.poll();
                if (curX == tx && curY == ty)
                    return step;
                for (int i = 0; i < 4; i++) {
                    int x = curX + dirX[i];
                    int y = curY + dirY[i];
                    if (x < 0 || y < 0 || x >= n_ || y >= m_ || visited[x][y] || forest.get(x).get(y) == 0)
                        continue;
                    visited[y][x] = true;
                    xq.offer(x);
                    yq.offer(y);
                }
            }
            step++;
        }
        return -1;
    }

    private List<int[]> getAllTreeHights(List<List<Integer>> forest) {
        List<int[]> treeHeights = new ArrayList<>();

        for(int y=0; y<n_;y++){
            for(int x=0; x<m_;x++){
                int tempVal = forest.get(y).get(x);
                if(tempVal>1){
                    int[] element = new int[3];
                    element[0] = x;
                    element[1] =y;
                    element[2] = tempVal;
                    treeHeights.add(element);
                }
            }
        }

        return treeHeights;
    }
}
