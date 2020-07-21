package com.LeetCodeJack.Problems2;
import java.util.*;
public class P454_4Sum2 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        if(A.length == 0|| A == null)
            return 0;
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        twoSum(C,D,map2);
        twoSum(A,B,map1);
        int target = 0;
        int res = 0;
        for (Map.Entry<Integer, Integer> entry:map1.entrySet()){
            target = 0 - entry.getKey();
            if(map2.containsKey(target)){
                res += entry.getValue() * map2.get(target);
            }
        }
        return res;
    }
    private void twoSum(int[] A, int[] B, Map<Integer, Integer> idxMap){
        int sum = 0;
        for(int i=0; i<A.length; i++){
            for(int j=0; j<B.length; j++){
                sum = A[i] + B[j];
                idxMap.put(sum,(idxMap.getOrDefault(sum, 0)+1));
            }
        }
    }
}


//    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
//        if(A.length == 0|| A == null)
//            return 0;
//        Map<Integer, List<String>> Map1 = new HashMap<>();
//        Map<Integer, List<String>> Map2 = new HashMap<>();
//        Set<String> resSet = new HashSet<>();
//        twoSum(A,B,Map1);
//        twoSum(C,D,Map2);
//        int res= 0;
//
//        List<String> list1;
//        List<String> list2;
//        for(Map.Entry<Integer, List<String>> entry : Map1.entrySet()){
//            int target = 0-entry.getKey();
//            if(Map2.containsKey(target)){
//                list1 = entry.getValue();
//                list2 = Map2.get(target);
//                for(String str1:list1){
//                    for(String str2:list2)
//                        resSet.add(str1+str2);
//                }
//            }
//        }
//        return resSet.size();
//    }
//    private void twoSum(int[] A, int[] B, Map<Integer, List<String>> idxMap){
//        int sum = 0;
//        for(int i=0; i<A.length; i++){
//            for(int j=0; j<B.length; j++){
//                sum = A[i] + B[j];
//                if(!idxMap.containsKey(sum))
//                    idxMap.put(sum, new ArrayList<String>());
//                idxMap.get(sum).add(i+""+j);
//            }
//        }
//    }
