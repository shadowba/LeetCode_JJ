package com.LeetCodeJack.Problems3;

import java.util.*;

public class P103_M_BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<Integer> curList = new ArrayList<>();
        List<List<Integer>> resList = new ArrayList<>();
        if (root == null)
            return resList;
        Deque<TreeNode> q = new LinkedList<>();

        q.addFirst(root);
        int size = 0;
        int lvl = 0;
        TreeNode cur;

        while (!q.isEmpty()) {
            size = q.size();
            if (lvl % 2 == 0) {
                while (size > 0) {
                    cur = q.removeFirst();
                    curList.add(cur.val);
                    if (cur.left != null) q.addLast(cur.left);
                    if (cur.right != null) q.addLast(cur.right);
                    size--;
                }
            } else {
                while (size > 0) {
                    cur = q.removeLast();
                    curList.add(cur.val);
                    if (cur.right != null) q.addFirst(cur.right);
                    if (cur.left != null) q.addFirst(cur.left);
                    size--;
                }
            }
            resList.add(new ArrayList<>(curList));
            curList.clear();
            lvl++;
        }
        return resList;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
