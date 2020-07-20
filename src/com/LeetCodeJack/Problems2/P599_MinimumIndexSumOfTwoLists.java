package com.LeetCodeJack.Problems2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P599_MinimumIndexSumOfTwoLists {
    Map<String, Integer> mapSet = new HashMap<>();
    List<String> res = new ArrayList<>();

    public String[] findRestaurant(String[] list1, String[] list2) {
        if (list1.length == 0 || list2.length == 0)
            return res.toArray(new String[0]);
        if (list1.length > list2.length)
            return findRestaurant(list2, list1);

        String name;
        int idxSum = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++)
            mapSet.put(list2[i], i);

        res.add(0, "");
        for (int j = 0; j < list1.length; j++) {
            name = list1[j];
            if (mapSet.containsKey(name)) {
                if (j + mapSet.get(name) < idxSum) {
                    res.set(0, name);
                    idxSum = j + mapSet.get(name);
                } else if (j + mapSet.get(name) == idxSum)
                    res.add(name);
            }
        }
        return res.toArray(new String[0]);
    }
}
