package com.LeetCodeJack.Problems;

import com.EssentialClasses.TreeNode;

public class P98_ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return isValidSub(root, null, null);
    }

    public boolean isValidSub(TreeNode root, Integer lowLimit, Integer highLimit) {
        if (root == null)
            return true;

        if (lowLimit != null && root.val <= lowLimit) return false;
        if (highLimit != null && root.val >= highLimit) return false;
        boolean isLeftValid = isValidSub(root.left, lowLimit, root.val);
        boolean isRightValid = isValidSub(root.right, root.val, highLimit);
        return isLeftValid && isRightValid;
    }
}


