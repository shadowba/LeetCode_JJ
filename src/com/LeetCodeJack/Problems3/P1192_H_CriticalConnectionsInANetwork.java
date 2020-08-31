package com.LeetCodeJack.Problems3;

import java.util.*;

//https://www.bilibili.com/video/av626130717/

public class P1192_H_CriticalConnectionsInANetwork {
    Map<Integer, List<Integer>> network;
    List<List<Integer>> resList;
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        int[] IDs = new int[n];
        resList = new ArrayList<>();
        Arrays.fill(IDs, -1);
        network = new HashMap<>();

        for (List<Integer> connection : connections) {
            network.putIfAbsent(connection.get(0), new ArrayList<>());
            network.putIfAbsent(connection.get(1), new ArrayList<>());
            network.get(connection.get(0)).add(connection.get(1));
            network.get(connection.get(1)).add(connection.get(0));
        }
        dfsHelper(-1,0,0,IDs);
        return resList;
    }

    private int dfsHelper(int father, int node, int ID, int[] IDs) {
        IDs[node] = ID;
        int tempId;
        for (int child : network.get(node)) {
            if (child == father)
                continue;
            else if (IDs[child] == -1) {
                IDs[node] = Math.min(IDs[node], dfsHelper(node, child, ID+1, IDs));
            }else{
                IDs[node] = Math.min(IDs[node], IDs[child]);
            }
        }
        if(IDs[node] == ID && father != -1){
            resList.add(Arrays.asList(father, node));
        }
        return IDs[node];
    }
}
