package com.LeetCodeJack.Problems2;

import java.util.*;

public class P752_OpenTheLock {

    public int openLock(String[] deadends, String target) {
        Queue<String> q = new LinkedList<>();
        Set<String> deadSet = new HashSet<>(Arrays.asList(deadends));
        Set<String> visited = new HashSet<>();
        int level = 0;

        q.offer("0000");
        visited.add("0000");
        String curLock;
        int size;
        while (!q.isEmpty()) {
            size = q.size();
            while (size > 0) {
                curLock = q.poll();
                if (deadSet.contains(curLock)) {
                    size--;
                    continue;
                }
                if (curLock.equals(target))
                    return level;
                for (int i = 0; i < 4; i++) {
                    char c = curLock.charAt(i);
                    String sb1 = curLock.substring(0, i) + ((c == '9') ? 0 : (c - '0' + 1)) + curLock.substring(i + 1);
                    String sb2 = curLock.substring(0, i) + ((c == '0') ? 9 : (c - '0' - 1)) + curLock.substring(i + 1);
                    if (!deadSet.contains(sb1) && !visited.contains(sb1)) {
                        q.offer(sb1);
                        visited.add(sb1);
                    }
                    if (!deadSet.contains(sb2) && !visited.contains(sb2)) {
                        q.offer(sb2);
                        visited.add(sb2);
                    }
                }
                size--;
            }

            level++;
        }
        return -1;
    }
}
