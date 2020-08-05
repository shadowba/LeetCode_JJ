package com;

import com.LeetCodeJack.Problems2.*;
import com.LeetCodeJack.Problems.*;
import com.LeetCodeJack.Problems3.*;

import java.util.*;
public class PlayGround {
    public static void main(String[] args) {
        P134_M_GasStation tester = new P134_M_GasStation();
        int[] gas  = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        tester.canCompleteCircuit(gas,cost);
    }
}
