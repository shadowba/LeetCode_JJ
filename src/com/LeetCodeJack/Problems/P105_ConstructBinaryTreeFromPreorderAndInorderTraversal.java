package com.LeetCodeJack.Problems;

import com.EssentialClasses.TreeNode;

public class P105_ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length != inorder.length)
            return null;
        return helperBuildTree(preorder, inorder, 0, 0, preorder.length);
    }

    private TreeNode helperBuildTree(int[] preorder, int[] inorder, int preOrderStart, int inOrderStart, int size) {
        if (size == 0)
            return null;

        TreeNode curNode = new TreeNode(preorder[preOrderStart]);
        int idx = inOrderStart;
        while (inorder[idx] != preorder[preOrderStart])
            idx++;
        int leftSize = idx - inOrderStart;
        int rightSize = size - leftSize - 1;
        TreeNode leftNode = helperBuildTree(preorder, inorder, preOrderStart + 1, inOrderStart, leftSize);
        TreeNode rightNode = helperBuildTree(preorder, inorder, preOrderStart + leftSize + 1, idx + 1, rightSize);
        curNode.left = leftNode;
        curNode.right = rightNode;
        return curNode;
    }
}
