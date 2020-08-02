package com.LeetCodeJack.Problems2;

import java.util.*;

public class P111_E_MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        Queue<TreeNode> q = new LinkedList<>();
        int size = 0;
        int lvCount = 0;
        TreeNode cur;
        q.offer(root);
        while (!q.isEmpty()) {
            size = q.size();
            while (size > 0) {
                cur = q.poll();
                size--;
                if (cur.left == null && cur.right == null)
                    return ++lvCount;
                else {
                    if (cur.left != null) q.offer(cur.left);
                    if (cur.right != null) q.offer(cur.right);
                }
            }
            lvCount++;
        }
        return lvCount;
    }

    public class TreeNode {
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
