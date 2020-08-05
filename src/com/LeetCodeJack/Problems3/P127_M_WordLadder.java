package com.LeetCodeJack.Problems3;
import java.util.*;
public class P127_M_WordLadder {
    int N;
    String[] words;
    Set<String> visited;
    int maxCount;
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        N = beginWord.length();
        words = new String[wordList.size()];
        words = wordList.toArray(words);
        Queue<String> q = new LinkedList<>();
        visited = new HashSet<>();
        q.offer(beginWord);
        maxCount = 0;
        int size = 0;
        String word ="";
        String s ="";
        while(!q.isEmpty()){
            size = q.size();
            maxCount++;
            while(size >0){
                word = q.poll();
                for(int i = 0; i<words.length; i++){
                    s= words[i];
                    if(isValid(word, s) && !visited.contains(s)){
                        if(s.equals(endWord)) return maxCount+1;
                        visited.add(s);
                        q.offer(s);
                    }
                }
                size--;
            }
        }
        return 0;
    }

    private boolean isValid(String word, String target) {
        int res = 0;

        for (int i = 0; i < N; i++) {
            if (word.charAt(i) != target.charAt(i))
                res++;
        }
        return (res <= 1) ? true : false;
    }
}