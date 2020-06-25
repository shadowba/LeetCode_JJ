package com.LeetCodeJack.Problems;

import java.util.*;

public class P3_LongSubStr {

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int length=0;
        char[] sourceArray = s.toCharArray();
        HashMap<Character, Integer> index = new HashMap<>();
        int ans = 0;
        int subLength = 0;

        for (int i = 0, j = 0; j < n; j++) {
            if (!index.containsKey(sourceArray[j]))
                index.put(sourceArray[j], j);
            else {
                i=Math.max(index.get(sourceArray[j]) + 1, i);

                index.replace(sourceArray[j], j);
            }

            length = j - i + 1;
            ans = Math.max(ans, length);
        }

        return ans;
    }

//    private ArrayList<Character> visited = new ArrayList<>();
//    private HashMap<Integer, String> result = new HashMap<>();
//
//    public int lengthOfLongestSubstring(String s) {
//        if (s.length() == 0)
//            return 0;
//        char[] inputChars = s.toCharArray();
//        findLongestSub(visited, result, inputChars);
//        int i = result.keySet().toArray().length;
//        int j = (int) result.keySet().toArray()[i - 1];
//        return j;
//    }
//
//    private void findLongestSub(ArrayList<Character> visited, HashMap<Integer, String> result, char[] inputChars) {
//        int length = inputChars.length;
//
//        for (int i = 0; i < length; i++) {
//            if (visited.contains(inputChars[i])) {
//                result.putIfAbsent(trimString(visited).length(), trimString(visited));
//                visited.clear();
//            }
//            visited.add(inputChars[i]);
//        }
//        if (!visited.isEmpty()) {
//            result.putIfAbsent(trimString(visited).length(), trimString(visited));
//        }
//    }
//
//    private String trimString(ArrayList<Character> visited) {
//        return visited.toString().
//                replaceAll(", ", "").
//                replace("[", "").
//                replace("]", "");
//    }

}
