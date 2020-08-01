package com.LeetCodeJack.Problems2;

public class P114_M_FlattenBinaryTreeToLinkedList {
    public void flatten(TreeNode root) {
        helperFlat(root);
    }

    private void helperFlat(TreeNode cur) {
        if (cur == null)
            return;
        helperFlat(cur.left);
        helperFlat(cur.right);
        if (cur.left != null) {
            TreeNode rightNode = cur.right;
            cur.right = cur.left;
            cur.left = null;
            TreeNode lastNode = cur;
            while (lastNode.right != null)
                lastNode = lastNode.right;
            lastNode.right = rightNode;
        }
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
