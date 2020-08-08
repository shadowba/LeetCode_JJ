package com.LeetCodeJack.Problems3;

import java.util.*;

public class P207_M_CourseSchedule {
    Map<Integer, List<Integer>> map;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (prerequisites == null || prerequisites.length == 0)
            return true;
        map = new HashMap<>();
        for (int[] combo : prerequisites) {
            if (!map.containsKey(combo[1]))
                map.put(combo[1], new ArrayList<Integer>());

            map.get(combo[1]).add(combo[0]);
        }
        // 用于存储visiting 或者 visited 状态， visiting 为 -1， visited 为 1
        // 如果在dfs中发现已经 -1 即正在visiting 的节点，说明有topological circle 出现
        // 立即退出dfs
        int[] visit = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (!finishDFS(i, visit))
                return false;
        }
        return true;
    }

    private boolean finishDFS(int course, int[] visit) {
        if (visit[course] == -1)
            return false;
        if (visit[course] == 1)
            return true;

        visit[course] = -1;
        if (map.containsKey(course)) {
            for (int preCourse : map.get(course)) {
                if (!finishDFS(preCourse, visit))
                    return false;
            }
        }
        visit[course] = 1;
        return true;
    }
}
