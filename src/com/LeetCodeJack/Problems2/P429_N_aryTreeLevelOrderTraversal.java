package com.LeetCodeJack.Problems2;

import java.util.*;

public class P429_N_aryTreeLevelOrderTraversal {
    List<Integer> lvList = new ArrayList<>();
    List<List<Integer>> resList = new ArrayList<>();
    Queue<Node> nodeQue = new ArrayDeque<>();

    public List<List<Integer>> levelOrder(Node root) {
        if (root == null)
            return new ArrayList<List<Integer>>();
        nodeQue.offer(root);
        Node cur;
        Iterator<Node> childIterator;
        int curLvSize = 1;
        int nextLvSize = 0;
        while (!nodeQue.isEmpty()) {
            cur = nodeQue.peek();
            childIterator = cur.children.iterator();
            if (cur.children != null) {
                while (childIterator.hasNext()) {
                    nodeQue.offer(childIterator.next());
                    nextLvSize++;
                }
            }
            lvList.add(nodeQue.poll().val);
            curLvSize--;
            if (curLvSize == 0) {
                curLvSize = nextLvSize;
                nextLvSize = 0;
                resList.add(new ArrayList<Integer>(lvList));
                lvList.clear();
            }
        }
        return resList;
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
