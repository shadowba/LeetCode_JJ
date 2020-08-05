package com.LeetCodeJack.Problems3;
import java.util.*;
public class P139_M_WordBreak {
    Map<String, Boolean> memory;
    public boolean wordBreak(String s, List<String> wordDict) {
        memory = new HashMap<>();
        Set<String> dic = new HashSet<>(wordDict);
        boolean res = wordHelper(s, dic);
        return res;
    }
    private boolean wordHelper(String sub, Set<String> dic){
//        如果内存里有已经计算的结果，直接返回曾经记忆的拆分结果，避免重复计算
        if(memory.containsKey(sub)) return memory.get(sub);
//        如果字典里有整个字符，直接返回，并记住
        if(dic.contains(sub)){
            memory.put(sub, true);
            return true;
        }
//        尝试每一个可能的拆分点
        for(int i = 1; i<=sub.length();i++){
            String left = sub.substring(0,i);
            String right = sub.substring(i,sub.length());
            if(dic.contains(right) && wordHelper(left,dic)){
                memory.put(sub,true);
                return true;
            }
        }
//        尝试失败，记住结果
        memory.put(sub,false);
        return false;
    }
}

//   Recursion without memory, overtime,太多重复计算

//    public boolean wordBreak(String s, List<String> wordDict) {
//        Map<Integer, Set<String>> dic = new HashMap<>();
//        int n = 0;
//        for(String word : wordDict) {
//            n = word.length();
//            if (!dic.containsKey(n))
//                dic.put(n, new HashSet<String>());
//            dic.get(n).add(word);
//        }
//        boolean res = wordHelper(s, dic);
//        return res;
//    }
//    private boolean wordHelper(String sub, Map<Integer, Set<String>> dic){
//        if(dic.containsKey(sub.length()) && dic.get(sub.length()).contains(sub))
//            return true;
//
//        String word;
//        for(int length : dic.keySet()){
//            if(length > sub.length())
//                continue;
//            word=sub.substring(0,length);
//            if(dic.get(length).contains(word) && wordHelper(sub.substring(length),dic))
//                return true;
//        }
//        return false;
//    }
