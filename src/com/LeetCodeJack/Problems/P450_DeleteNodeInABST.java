package com.LeetCodeJack.Problems;

import com.EssentialClasses.TreeNode;

public class P450_DeleteNodeInABST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)
            return null;

        if(root.val < key)
            root.right = deleteNode(root.right, key);
        else if (root.val > key)
            root.left = deleteNode(root.left, key);
        else{
            if(root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            TreeNode successor = getInOderSuccessor(root);
            root.val = successor.val;
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }

    private TreeNode getInOderSuccessor(TreeNode cur){
        TreeNode successor = cur.right;
        while(successor.left != null){
            successor = successor.left;
        }
        return successor;
    }
}
