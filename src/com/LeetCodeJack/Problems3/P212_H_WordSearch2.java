package com.LeetCodeJack.Problems3;

import java.util.*;

public class P212_H_WordSearch2 {
    List<String> resList;

    public List<String> findWords(char[][] board, String[] words) {
        resList = new ArrayList<>();
        if (board == null || words == null)
            return resList;
        trieNode root = buildTrie(words);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                helper(board, root, i, j);
            }
        }
        return resList;
    }

    private void helper(char[][] board, trieNode root, int i, int j) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] == '#')
            return;

        char ch = board[i][j];
        trieNode cur = root.children[ch - 'a'];
        if (cur == null)
            return;
        if (cur.isWord) {
            resList.add(cur.val); // Found one!
            cur.isWord = false;   // de-duplicate
        }

        board[i][j] = '#';
        helper(board, cur, i - 1, j);
        helper(board, cur, i + 1, j);
        helper(board, cur, i, j - 1);
        helper(board, cur, i, j + 1);
        board[i][j] = ch;
    }

    private trieNode buildTrie(String[] words) {
        trieNode root = new trieNode("");
        trieNode cur = root;
        char ch;
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                ch = word.charAt(i);
                if (cur.children[ch - 'a'] == null) {
                    cur.children[ch - 'a'] = new trieNode(word.substring(0, i + 1));
                }
                cur = cur.children[ch - 'a'];
            }
            cur.isWord = true;
            cur = root;
        }
        return root;
    }

    private class trieNode {
        trieNode[] children;
        String val;
        boolean isWord;

        public trieNode(String val) {
            children = new trieNode[26];
            this.val = val;
            isWord = false;
        }
    }
}
