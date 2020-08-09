package com.LeetCodeJack.Problems3;

import java.util.*;

public class P211_M_AddAndSearchWord_DataStructureDesign {
    public static class WordDictionary {
        TrieNode root;
        Set<String> words;

        /**
         * Initialize your data structure here.
         */
        public WordDictionary() {
            root = new TrieNode();
            words = new HashSet<>();
        }

        /**
         * Adds a word into the data structure.
         */
        public void addWord(String word) {
            if (!words.contains(word))
                words.add(word);
            TrieNode cur = root;
            char c;
            for (int i = 0; i < word.length(); i++) {
                c = word.charAt(i);
                if (!cur.children.containsKey(c))
                    cur.children.put(c, new TrieNode(word.substring(0, i + 1)));
                cur = cur.children.get(c);
            }
            cur.isWord = true;
        }

        /**
         * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
         */
        public boolean search(String word) {
            char c;
            TrieNode cur = root;
            for (int i = 0; i < word.length(); i++) {
                c = word.charAt(i);
                if (c != '.' && !cur.children.containsKey(c))
                    return false;
                if (c == '.')
                    return traverse(cur, word.substring(i));
                cur = cur.children.get(c);
            }
            return cur.isWord;
        }

        private boolean traverse(TrieNode cur, String subString) {
            if (subString.equals(""))
                return cur.isWord;

            if (subString.startsWith(".")) {
                subString = subString.substring(1);
                for (char c : cur.children.keySet()) {
                    if (traverse(cur.children.get(c), subString))
                        return true;
                }
            } else {
                char c = subString.charAt(0);
                subString = subString.substring(1);
                if (cur.children.containsKey(c))
                    return traverse(cur.children.get(c), subString);
                else
                    return false;
            }

            return false;
        }

        private class TrieNode {
            String str;
            Map<Character, TrieNode> children = new HashMap<>();
            boolean isWord = false;

            TrieNode(String s) {
                this.str = s;
            }

            TrieNode() {
            }
        }
    }
}
