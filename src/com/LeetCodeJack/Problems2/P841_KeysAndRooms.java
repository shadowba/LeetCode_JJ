package com.LeetCodeJack.Problems2;

import java.util.*;

public class P841_KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int N = rooms.size();
        int room = 0;
        Set<Integer> visited = new HashSet<>();
        List<Integer> keyList;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        while(!stack.isEmpty()){
            room = stack.pop();
            keyList = rooms.get(room);
            for(int key: keyList){
                if(!visited.contains(key)){
                    visited.add(key);
                    stack.push(key);
                }
            }
        }
        for(int i =1; i<N; i++){
            if(!visited.contains(i))
                return false;
        }
        return true;
    }
}
