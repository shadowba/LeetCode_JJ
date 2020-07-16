package com.LeetCodeJack.Problems;

import com.EssentialClasses.TreeNode;

public class P112_PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        return helperSum(root, 0, sum);
    }

    private boolean helperSum(TreeNode cur, int curSum, int target) {
        if(cur != null && cur.left == null && cur.right == null && curSum + cur.val == target)
            return true;

        if(cur == null)
            return false;

        return helperSum(cur.left, curSum + cur.val, target) || helperSum(cur.right, curSum + cur.val, target);
    }
}
