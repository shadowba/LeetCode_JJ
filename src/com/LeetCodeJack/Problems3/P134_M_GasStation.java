package com.LeetCodeJack.Problems3;
import java.util.*;
public class P134_M_GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int N = gas.length;
        int[] tank = new int[N];
        int cur = 0;
        int prev = 0;
        int sum = 0;
        for(int j = 0; j<N; j++){
            sum += gas[j]-cost[j];
        }
        if(sum <0) return -1;

        for (int start = 0; start < N; start++) {
            tank[start] = gas[start];
            for (int i = 1; i <= N; i++) {
                cur = (start + i >= N) ? start + i - N : start + i;
                prev = (start + i - 1 >= N) ? start + i - N - 1 : start + i - 1;
                if (cur == start && tank[prev] - cost[prev] >= 0)
                    return start;
                else if(tank[prev] - cost[prev]<0)
                    break;
                else
                    tank[cur] = tank[prev] + gas[cur] - cost[prev];

                if (tank[cur] < 0)
                    break;
            }
            tank = new int[N];
        }
        return -1;
    }
}
