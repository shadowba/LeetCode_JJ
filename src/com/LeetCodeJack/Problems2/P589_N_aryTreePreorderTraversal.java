package com.LeetCodeJack.Problems2;

import java.util.*;

public class P589_N_aryTreePreorderTraversal {
    List<Integer> resList = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        if(root == null)
            return resList;
        helperPreOrder(root);
        return resList;
    }

    private void helperPreOrder(Node cur) {
        if (cur.children == null) {
            resList.add(cur.val);
            return;
        }
        resList.add(cur.val);
        Iterator<Node> child = cur.children.iterator();
        while (child.hasNext())
            helperPreOrder(child.next());
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
}
