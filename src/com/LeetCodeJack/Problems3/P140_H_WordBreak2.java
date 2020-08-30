package com.LeetCodeJack.Problems3;
import java.util.*;
public class P140_H_WordBreak2 {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        Map<String, List<String>> memory = new HashMap<>();

        StringBuilder sb = new StringBuilder();

        return helper(s,set,memory);
    }

    private List<String> helper(String s, Set<String> set, Map<String, List<String>> memory){
        if(memory.containsKey(s))
            return memory.get(s);
        if(s.equals("")){
            return null;
        }
        List<String> res = new ArrayList<>();
        for(int i=1; i<=s.length(); i++){
            List<String> nextRes=null;
            if(set.contains(s.substring(0,i))){
                nextRes = helper(s.substring(i),set,memory);
                if(nextRes!=null){
                    for(String str:nextRes){
                        res.add(s.substring(0,i)+" "+ str);
                    }
                }else{
                    res.add(s.substring(0,i));
                }
            }
        }
        memory.put(s,res);
        return res;
    }

}
