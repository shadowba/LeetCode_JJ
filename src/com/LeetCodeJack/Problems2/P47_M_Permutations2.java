package com.LeetCodeJack.Problems2;
import java.util.*;
public class P47_M_Permutations2 {
    List<List<Integer>> resList = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        if(nums == null || nums.length == 0)
            return resList;
        boolean[] used = new boolean[nums.length];
        List<Integer> comboList = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums, used, comboList);
        return resList;
    }
    private void dfs(int[] nums, boolean[] used, List<Integer> curList){
        if(curList.size() == nums.length){
            resList.add(new ArrayList<>(curList));
            return;
        }
        for(int i = 0; i<nums.length; i++){
            if(used[i] == true) continue;
            if(i >0 && nums[i - 1] == nums[i] && !used[i - 1]) continue;
            used[i] = true;
            curList.add(nums[i]);
            dfs(nums,used,curList);
            curList.remove(curList.size()-1);
            used[i] = false;
        }
    }
}

//    Set<String> seen = new HashSet<>();
//    List<List<Integer>> resList = new ArrayList<>();
//    Set<Integer> idxVisited = new HashSet<>();
//    public List<List<Integer>> permuteUnique(int[] nums) {
//        int N = nums.length;
//        List<Integer> comboList = new ArrayList<>();
//        StringBuilder sb = new StringBuilder();
//        helperPermute(nums,-1,comboList, sb);
//        return resList;
//    }
//    private void helperPermute(int[] array, int idx, List<Integer> arrList, StringBuilder sb){
//        if(idx != -1){
//            arrList.add(array[idx]);
//            sb.append(Integer.toString(array[idx]));
//        }
//        if(arrList.size() == array.length){
//            if(!seen.contains(sb.toString())) {
//                seen.add(sb.toString());
//                resList.add(new ArrayList<>(arrList));
//                return;
//            }
//        }
//        for(int i = 0; i < array.length; i++){
//            if(!idxVisited.contains(i)){
//                idxVisited.add(i);
//                helperPermute(array, i, arrList, sb);
//                idxVisited.remove(i);
//                sb.deleteCharAt(sb.length()-1);
//                arrList.remove(arrList.size()-1);
//            }
//        }
//    }
