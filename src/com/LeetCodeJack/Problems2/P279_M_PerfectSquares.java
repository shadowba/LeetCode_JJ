package com.LeetCodeJack.Problems2;
import java.util.*;
public class P279_M_PerfectSquares {
    public int numSquares(int n) {
        if (n <= 0)
            return -1;

        Queue<Integer> q = new LinkedList<>();
        Set<Integer> existed = new HashSet<>();
        int level = 0;
        int sum = 0;
        int size = 0;
        int temp = 0;
        int limit = (int) Math.sqrt((double) (n - 0));
        q.offer(sum);
        existed.add(sum);
        while (!q.isEmpty()) {
            size = q.size();
            level++;
            while (size > 0) {
                sum = q.poll();
                limit = (int) Math.sqrt((double) (n - sum));
                for (int i = 1; i <= limit; i++) {
                    temp = sum + i * i;
                    if (temp == n) return level;
                    if (temp > n) {
                        break;
                    }
                    if (!existed.contains(temp)) {
                        q.offer(temp);
                        existed.add(temp);
                    }
                }
                size--;
            }
        }
        return -1;
    }
}
