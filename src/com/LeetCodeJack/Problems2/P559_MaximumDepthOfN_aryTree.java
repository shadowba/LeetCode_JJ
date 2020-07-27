package com.LeetCodeJack.Problems2;

import java.util.*;

public class P559_MaximumDepthOfN_aryTree {
    public int maxDepth(Node root) {
        if (root == null)
            return 0;
        return helperMaxDepth(root) + 1;
    }

    private int helperMaxDepth(Node cur) {
        if (cur.children == null)
            return 1;

        int height = 0;
        Iterator<Node> childIterator = cur.children.iterator();
        while (childIterator.hasNext())
            height = Math.max(height, helperMaxDepth(childIterator.next()) + 1);

        return height;
    }

    private class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    ;
}
