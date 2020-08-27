package com.LeetCodeJack.Problems3;
import java.util.*;
public class P957_M_PrisonCellsAfterNDays {
    public int[] prisonAfterNDays(int[] cells, int N) {
        Set<String> set = new HashSet<>();
        boolean hasCircle = false;
        int[] curCells=cells;
        int[] next;
        int cnt=0;
        for(int i = 0; i<N; i++){
            next = nextDay(curCells);
            String prison = Arrays.toString(next);
            if(set.contains(prison)){
                hasCircle=true;
                break;
            }else{
                set.add(prison);
                cnt++;
            }
            curCells = next;
        }
        if(hasCircle){
            N=N%cnt;
            for(int i = 0; i<N; i++){
                curCells = nextDay(curCells);
            }
        }
        return curCells;
    }

    private int[] nextDay(int[] cells){
        int[] temp = new int[cells.length];
        for(int i=1; i<7; i++){
            temp[i] = (cells[i-1]==cells[i+1])?1:0;
        }
        return temp;
    }
}
