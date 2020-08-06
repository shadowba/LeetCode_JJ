package com.LeetCodeJack.Problems3;

import java.util.*;

public class P226_E_InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;
        Queue<TreeNode> q = new LinkedList<>();
        int size = 0;
        q.offer(root);
        TreeNode cur;
        TreeNode temp;
        while (!q.isEmpty()) {
            size = q.size();
            while (size > 0) {
                cur = q.poll();
                if (cur.left != null) q.offer(cur.left);
                if (cur.right != null) q.offer(cur.right);
                temp = cur.left;
                cur.left = cur.right;
                cur.right = temp;
                size--;
            }
        }
        return root;
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
