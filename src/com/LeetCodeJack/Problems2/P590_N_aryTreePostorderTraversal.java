package com.LeetCodeJack.Problems2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P590_N_aryTreePostorderTraversal {
    List<Integer> resList = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if(root == null)
            return resList;
        helperPostOrder(root);
        return resList;
    }
    private void helperPostOrder(Node cur) {
        if (cur.children == null) {
            resList.add(cur.val);
            return;
        }

        Iterator<Node> childIterator = cur.children.iterator();
        while (childIterator.hasNext()){
            helperPostOrder(childIterator.next());
        }
        resList.add(cur.val);
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
