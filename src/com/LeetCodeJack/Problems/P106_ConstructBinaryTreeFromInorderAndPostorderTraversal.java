package com.LeetCodeJack.Problems;

import com.EssentialClasses.TreeNode;

public class P106_ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || postorder == null || inorder.length != postorder.length)
            return null;
        return helperTree(inorder, postorder, 0 , 0 , inorder.length);
    }

    private TreeNode helperTree(int[] inorder, int[] postorder, int inOrderStart, int postOrderStart, int size) {
        if (size == 0)
            return null;
        TreeNode curNode = new TreeNode(postorder[postOrderStart + size - 1]);
        int idx = inOrderStart;
        while(inorder[idx] != postorder[postOrderStart + size - 1]){
            idx++;
        }

        int leftSize = idx - inOrderStart;
        int rightSize = size - leftSize - 1;
        TreeNode leftNode = helperTree(inorder, postorder, inOrderStart, postOrderStart, leftSize);
        TreeNode rightNode = helperTree(inorder, postorder, idx + 1, leftSize + postOrderStart, rightSize);
        curNode.left = leftNode;
        curNode.right = rightNode;
        return curNode;
    }
}
