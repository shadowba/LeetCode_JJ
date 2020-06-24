package com.LeetCodeJack.Problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class P3_LongSubstr {
    private Set<Character> visiting = new HashSet<>();
    private Set<Character> visited = new HashSet<>();
    private HashMap<String, Integer> result=new HashMap<>();

    public int lengthOfLongestSubstring(String s) {
        char[] inputChars = s.toCharArray();
        findLongestSub(visiting,visited,result,inputChars);

        return 0;
    }

    private void findLongestSub(Set<Character> visited,Set<Character> visiting,HashMap<String,Integer> result, char[] inputChars){
        int length = inputChars.length;
        for(int i=0;i<length;i++){
            if(!visited.contains(inputChars[i]))
                visited.add(inputChars[i]);
            else
                
        }
    }


}
