package com.LeetCodeJack.Problems2;

import java.util.*;

public class P107_E_BinaryTreeLevelOrderTraversal2 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> topDownList = new ArrayList<>();
        if(root == null)
            return topDownList;
        List<Integer> list = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int size = 0;
        TreeNode cur;

        while (!q.isEmpty()) {
            size = q.size();
            while (size > 0) {
                cur = q.poll();
                list.add(cur.val);
                if (cur.left != null) q.offer(cur.left);
                if (cur.right != null) q.offer(cur.right);
                size--;
            }
            topDownList.add(new LinkedList<>(list));
            list.clear();
        }

        Collections.reverse(topDownList);
        return topDownList;
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
