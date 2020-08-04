package com;

import com.LeetCodeJack.Problems2.*;
import com.LeetCodeJack.Problems.*;
import com.LeetCodeJack.Problems3.*;

import java.util.*;
public class PlayGround {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(2);
        List<Integer> list2 = List.of(3,4);
        List<Integer> list3 = List.of(6,5,7);
        List<Integer> list4 = List.of(4,1,8,3);
        List<List<Integer>> triangle = List.of(list1, list2, list3, list4);
        P120_M_Triangle tester = new P120_M_Triangle();
        int val = tester.minimumTotal(triangle);
        System.out.println(val);
    }
}
