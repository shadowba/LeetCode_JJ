package com.LeetCodeJack.Problems3;

import java.util.*;

public class P692_M_TopKFrequentWords {
    Map<String, Integer> dicFreq;
    public List<String> topKFrequent(String[] words, int k) {
        List<String> resList  =new ArrayList<>();
        dicFreq = new HashMap<>();
        qComp comp = new qComp();
        for(String word:words)
            dicFreq.put(word, dicFreq.getOrDefault(word,0)+1);
        Queue<String> q = new PriorityQueue<>(comp);
        // for (String key : dicFreq.keySet()) {
        //     q.offer(key);
        //     if (q.size() > k)
        //         q.poll();
        // }
        // while(!q.isEmpty()){
        //     resList.add(q.poll());
        // }
        q.addAll(dicFreq.keySet());
        for (int i = 0; i < k; i++) {
            if (!q.isEmpty()) {
                resList.add(q.poll());
            }
        }
        return resList;
    }

    private class qComp implements Comparator<String>{
        @Override
        public int compare(String s1, String s2){
            if(dicFreq.get(s1)==dicFreq.get(s2)){
                return s1.compareTo(s2);
            }
            return dicFreq.get(s2)-dicFreq.get(s1);
        }
    }
}
