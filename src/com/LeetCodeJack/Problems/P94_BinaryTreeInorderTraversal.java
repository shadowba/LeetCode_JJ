package com.LeetCodeJack.Problems;

import com.EssentialClasses.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class P94_BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null)
            return res;
        helperTraverse(root, res);
        return res;
    }

    private void helperTraverse(TreeNode curNode, List<Integer> res) {
        if(curNode == null)
            return;

        helperTraverse(curNode.left, res);
        res.add(curNode.val);
        helperTraverse(curNode.right, res);
    }
}
