package com.LeetCodeJack.Problems3;
import java.util.*;
public class P208_M_ImplementTrie_PrefixTree {

    public static class Trie{
        /** Initialize your data structure here. */
        TrieNode root;
        public Trie() {
            root = new TrieNode();
            root.string = "";
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            if(word == null || word.length() == 0)
                return;
            TrieNode cur = root;
            char c;
            for(int i=0; i<word.length(); i++){
                c = word.charAt(i);
                if(!cur.map.containsKey(c))
                    cur.map.put(c, new TrieNode(word.substring(0,i+1)));

                cur = cur.map.get(c);
                if(i==word.length()-1)
                    cur.isWord =true;
            }
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            if(word == null || word.length() == 0)
                return false;
            TrieNode cur = root;
            for(int i =0; i<word.length();i++){
                if(!cur.map.containsKey(word.charAt(i)))
                    return false;
                cur = cur.map.get(word.charAt(i));
            }
            return cur.isWord;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            TrieNode cur = root;
            for(int i=0; i<prefix.length(); i++){
                if(!cur.map.containsKey(prefix.charAt(i)))
                    return false;
                cur=cur.map.get(prefix.charAt(i));
            }
            if((cur.map.size()==0 && cur.isWord)||(cur.map.size()!=0))
                return true;
            else
                return false;
        }

        private class TrieNode{
            String string;
            Map<Character, TrieNode> map;
            boolean isWord = false;
            public TrieNode(){
                map = new HashMap<>();
            }
            public TrieNode(String s){
                this.string = s;
                map = new HashMap<>();
            }
        }
    }
}
