package com.LeetCodeJack.Problems;

import com.EssentialClasses.TreeNode;

public class P100_SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;

        boolean left = isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);
        boolean nodeVal = (p.val == q.val) ? true : false;

        return nodeVal && (left && right);
    }
}

