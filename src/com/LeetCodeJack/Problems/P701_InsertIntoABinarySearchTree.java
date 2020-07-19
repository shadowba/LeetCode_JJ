package com.LeetCodeJack.Problems;

import com.EssentialClasses.TreeNode;

public class P701_InsertIntoABinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            root = new TreeNode (val);
            return root;
        }

        TreeNode cur = root;
        boolean slotAvailable = false;
        while (!slotAvailable) {
            if (val >= cur.val) {
                slotAvailable = (cur.right == null) ? true : false;
                if(slotAvailable)
                    cur.right = new TreeNode(val);
                cur = cur.right;
            } else {
                slotAvailable = (cur.left == null) ? true : false;
                if(slotAvailable)
                    cur.left = new TreeNode(val);
                cur = cur.left;
            }
        }
        return root;
    }
}
