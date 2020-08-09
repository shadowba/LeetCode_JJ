package com.LeetCodeJack.Problems3;

import java.util.*;

public class P677_M_MapSumPairs {
    public static class MapSum {
        TrieNode root;
        Map<String, Integer> map;

        /**
         * Initialize your data structure here.
         */
        public MapSum() {
            root = new TrieNode();
            map = new HashMap<>();
        }

        public void insert(String key, int val) {
            char c;
            TrieNode cur = root;
            int delta = val - map.getOrDefault(key, 0);
            map.put(key, val);
            for (int i = 0; i < key.length(); i++) {
                cur.score += delta;
                c = key.charAt(i);
                if (!cur.children.containsKey(c))
                    cur.children.put(c, new TrieNode(key.substring(0, i + 1)));
                cur = cur.children.get(c);
            }
            cur.score += delta;
        }

        public int sum(String prefix) {
            char c;
            TrieNode cur = root;

            for (int i = 0; i < prefix.length(); i++) {
                c = prefix.charAt(i);
                if (!cur.children.containsKey(c))
                    return 0;

                cur = cur.children.get(c);
            }

            if (cur.str.equals(prefix))
                return cur.score;
            else
                return 0;
        }

        private class TrieNode {
            Map<Character, TrieNode> children = new HashMap();
            String str;
            int score;

            public TrieNode() {
                score = 0;
            }

            public TrieNode(String s) {
                this.str = s;
                score = 0;
            }
        }
    }

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */
}
