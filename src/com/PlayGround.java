package com;

import com.LeetCodeJack.Problems2.*;
import com.LeetCodeJack.Problems.*;
import com.LeetCodeJack.Problems3.*;

import java.util.*;
public class PlayGround {
    public static void main(String[] args) {
        P208_M_ImplementTrie_PrefixTree.Trie t = new P208_M_ImplementTrie_PrefixTree.Trie();
        boolean res = false;
        t.insert("apple");
        res = t.search("apple");
        System.out.println(res);

        res = t.search("app");
        System.out.println(res);
    }
}
