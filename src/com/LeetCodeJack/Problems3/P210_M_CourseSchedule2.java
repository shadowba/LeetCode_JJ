package com.LeetCodeJack.Problems3;

import java.util.*;

public class P210_M_CourseSchedule2 {
    Map<Integer, List<Integer>> map;
    List<Integer> resList;

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        map = new HashMap<>();
        resList = new ArrayList<>();
        int[] visit = new int[numCourses];
        Queue<Integer> q = new LinkedList<>();
        for (int[] combo : prerequisites) {
            if (!map.containsKey(combo[1]))
                map.put(combo[1], new ArrayList<>());
            map.get(combo[1]).add(combo[0]);
        }
        q.offer(prerequisites[0][1]);
        int size = q.size();
        int cur = 0;
        while(!q.isEmpty()){
            size= q.size();
            while(size>0){
                cur = q.poll();
                if(visit[cur] == 1){
                    size--;
                    continue;
                }
                visit[cur] =1;
                resList.add(cur);
                if(map.containsKey(cur)){
                    for(int c: map.get(cur)){
                        q.offer(c);
                    }
                }
                size--;
            }
        }
        int[] res = new int[numCourses];
        if(prerequisites.length==0){
            for (int i = 0; i < numCourses; i++) {
                res[i] = i;
            }
        }else{
            for (int i = 0; i < numCourses; i++) {
                res[i] = resList.get(i);
            }
        }

        return res;
    }
}
//    Map<Integer, List<Integer>> map;
//    int N;
//    List<Integer> resList;
//
//    public int[] findOrder(int numCourses, int[][] prerequisites) {
//        map = new HashMap<>();
//        N = numCourses;
//        resList = new ArrayList<>();
//        int[] visit = new int[numCourses];
//        for (int[] combo : prerequisites) {
//            if (!map.containsKey(combo[1]))
//                map.put(combo[1], new ArrayList<>());
//            map.get(combo[1]).add(combo[0]);
//        }
//        dfsFinish(0,visit);
//        int[] res = new int[numCourses];
//        for(int i=0; i< numCourses; i++){
//            res[i] = resList.get(i);
//        }
//        return res;
//    }
//
//    // -1 = visiting, 1 = visited, 0 = not visited.
//    private void dfsFinish(int course, int[] visit) {
//        if (visit[course] == 1)
//            return;
//
//        if (visit[course] == 0) {
//            visit[course] = 1;
//            resList.add(course);
//        }
//        if (map.containsKey(course)) {
//            for (int c : map.get(course)) {
//                dfsFinish(c, visit);
//            }
//        }
//
//    }
