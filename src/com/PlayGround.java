package com;

import com.LeetCodeJack.Problems2.*;
import com.LeetCodeJack.Problems.*;
import java.util.*;
public class PlayGround {
    public static void main(String[] args) {
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(2);
        list2.add(1);
        set.add(list1);
        set.add(list2);
        System.out.println("END");
    }
}
