package com.LeetCodeJack.Problems2;

public class P129_M_SumRootToLeafNumbers {
    int resSum;

    public int sumNumbers(TreeNode root) {
        resSum = 0;
        int curSum = 0;
        helperSum(root, curSum);
        return resSum;
    }

    private void helperSum(TreeNode cur, int curSum) {
        if (cur == null)
            return;
        if (isLeaf(cur)) {
            curSum = curSum * 10 + cur.val;
            resSum += curSum;
            return;
        }
        curSum = curSum * 10 + cur.val;
        helperSum(cur.left, curSum);
        helperSum(cur.right, curSum);
    }

    private boolean isLeaf(TreeNode node) {
        return (node.left == null && node.right == null);
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
