package com.LeetCodeJack.Problems3;

import java.util.*;

//https://www.bilibili.com/video/av626130717/

public class P1192_M_CriticalConnectionsInANetwork {
    List<List<Integer>> resList;
    Map<Integer, List<Integer>> connectionMap;

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        resList=new ArrayList<>();
        connectionMap = new HashMap<>();
        int[] id = new int[n];
        Arrays.fill(id, -1);
        for (List<Integer> connection : connections) {
            if (!connectionMap.containsKey(connection.get(0)))
                connectionMap.put(connection.get(0), new ArrayList<>());
            connectionMap.get(connection.get(0)).add(connection.get(1));
            if (!connectionMap.containsKey(connection.get(1)))
                connectionMap.put(connection.get(1), new ArrayList<>());
            connectionMap.get(connection.get(1)).add(connection.get(0));
        }
        dfs(-1, 0, 0, id);
        System.out.println(Arrays.toString(id));
        return resList;
    }

    private int dfs(int father, int node, int nodeID, int[] id) {
        id[node] = nodeID;
        for (int child : connectionMap.get(node)) {
            if (child == father) continue;
            else if (id[child] == -1)
                id[node] = Math.min(nodeID, dfs(node, child, nodeID + 1, id));
            else
                id[node] = Math.min(nodeID, id[child]);
        }
        if (id[node] == nodeID){
            resList.add(Arrays.asList(father,node));
        }
        return id[node];
    }
}
