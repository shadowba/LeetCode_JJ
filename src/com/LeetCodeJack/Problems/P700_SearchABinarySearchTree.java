package com.LeetCodeJack.Problems;

import com.EssentialClasses.TreeNode;

public class P700_SearchABinarySearchTree {
//       ---   Iteration Method   ---
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode cur = root;
        while(cur != null){
            if(val > cur.val)
                cur = cur.right;
            else if (val < cur.val)
                cur = cur.left;
            else
                return cur;
        }
        return null;
    }
}

//   ---   Recursion Method   ---
//public TreeNode searchBST(TreeNode root, int val) {
//        return helper(root, val);
//        }
//
//public TreeNode helper(TreeNode top, int val){
//        if(top == null)
//        return null;
//
//        if(val == top.val)
//        return top;
//        else if(val > top.val)
//        return helper(top.right, val);
//        else
//        return helper(top.left,val);
//        }
