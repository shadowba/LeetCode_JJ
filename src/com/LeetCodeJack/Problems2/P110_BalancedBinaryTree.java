package com.LeetCodeJack.Problems2;

import com.EssentialClasses.TreeNode;

public class P110_BalancedBinaryTree {
    boolean result = true;
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        heightSub(root);
        return result;
    }

    private int heightSub (TreeNode cur){
        if(cur == null)
            return 0;
        int heightL = heightSub(cur.left) + 1;
        int heightR = heightSub(cur.right) + 1;
        if( Math.abs(heightL - heightR) > 1 )
            result = false;
        return Math.max(heightL , heightR);
    }
}
