package com.LeetCodeJack.Problems;
import java.util.HashSet;
import java.util.Set;
public class P52_NQueens2 {
    private Set<Integer> occupiedCol = new HashSet<>();
    // private Set<Integer> occupiedRow = new HashSet<>();
    private Set<Integer> occupiedDiag1 = new HashSet<>();
    private Set<Integer> occupiedDiag2 = new HashSet<>();
    public int totalNQueens(int n) {
        return helperTotalNQueens(0,n,0);
    }

    private int helperTotalNQueens(int row, int n, int count){
        for(int col = 0; col < n; col++){
            if(occupiedCol.contains(col))
                continue;

            int diag1 = row + col;
            if(occupiedDiag1.contains(diag1))
                continue;

            int diag2 = row - col;
            if(occupiedDiag2.contains(diag2))
                continue;

            if(row == n-1)
                count++;
            else{
                occupiedCol.add(col);
                occupiedDiag1.add(diag1);
                occupiedDiag2.add(diag2);
                count = helperTotalNQueens(row+1, n, count);
                occupiedCol.remove(col);
                occupiedDiag1.remove(diag1);
                occupiedDiag2.remove(diag2);
            }
        }
        return count;
    }
}
