package com.LeetCodeJack.Problems;

import com.EssentialClasses.TreeNode;

import java.util.*;

public class P144_BinaryTreePreorderTraversal {
    //  ---  Pre-Order Traversal Recursion Method ---
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> resList = new ArrayList<>();
        helperPreOrder(root, resList);
        return resList;
    }

    private void helperPreOrder(TreeNode node, List<Integer> resList) {
        if (node == null)
            return;

        resList.add(node.val);
        helperPreOrder(node.left, resList);
        helperPreOrder(node.right, resList);
    }
}
//  ---  Pre-Order Traversal Iteration Method ---

//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> resList = new ArrayList<>();
//        Stack<TreeNode> rightChildStack = new Stack<>();
//        TreeNode node = root;
//        while(node != null){
//            resList.add(node.val);
//            if(node.right != null)
//                rightChildStack.push(node.right);
//            node = node.left;
//            if(node == null && !rightChildStack.isEmpty())
//                node = rightChildStack.pop();
//        }
//        return resList;
//    }
