package com;

import com.LeetCodeJack.Problems2.*;
import com.LeetCodeJack.Problems.*;
import com.LeetCodeJack.Problems3.*;

import java.util.*;
public class PlayGround {
    public static void main(String[] args) {
        String[] dict = {"apple", "pen", "applepen", "pine", "pineapple"};
        List<String> dic = Arrays.asList(dict);
        P140_H_WordBreak2 tester = new P140_H_WordBreak2();
        tester.wordBreak("pineapplepenapple",dic);
    }
}
