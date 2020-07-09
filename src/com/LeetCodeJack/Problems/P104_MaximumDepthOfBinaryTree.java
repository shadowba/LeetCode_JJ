package com.LeetCodeJack.Problems;

import com.EssentialClasses.TreeNode;

public class P104_MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        return helperMaxDepth(root, 1);
    }

    private int helperMaxDepth(TreeNode node, int curDepth) {
        if (node == null)
            return curDepth - 1;

        return Math.max(helperMaxDepth(node.left, curDepth+1), helperMaxDepth(node.right, curDepth+1));
    }
}
