package com.LeetCodeJack.Problems3;

import java.util.*;

public class P222_M_CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int size = 0;
        TreeNode cur;
        int res = 0;
        while (!q.isEmpty()) {
            size = q.size();
            while (size > 0) {
                cur = q.poll();
                res++;
                if (cur.left != null) q.offer(cur.left);
                if (cur.right != null) q.offer(cur.right);
                size--;
            }
        }
        return res;
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
