package com.followHuaHua.MediumList;

import java.util.*;

public class P655_M_PrintBinaryTree {
    List<List<String>> res;

    public List<List<String>> printTree(TreeNode root) {
        res = new ArrayList<>();
        int h = getHeight(root);
        int w = (1 << h) - 1; // 2^h - 1;
        fill(root, 0, w, 0, w - 1);
        return res;
    }

    private void fill(TreeNode cur, int level, int width, int left, int right) {
        if (cur == null)
            return;

        int mid = (left + right) / 2;
        List<String> curList;
        if (res.size() <= level || res.get(level) == null) {
            curList = new ArrayList<>();
            res.add(level, curList);
            for (int i = 0; i < width; i++) {
                curList.add("");
            }
        } else {
            curList = res.get(level);
        }
        curList.set(mid, Integer.toString(cur.val));
        fill(cur.left, level + 1, width, left, mid - 1);
        fill(cur.right, level + 1, width, mid + 1, right);
    }

    private int getHeight(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
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
