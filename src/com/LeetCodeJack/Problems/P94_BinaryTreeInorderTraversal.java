package com.LeetCodeJack.Problems;

import com.EssentialClasses.TreeNode;

import java.util.ArrayList;
import java.util.*;

public class P94_BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> resList = new ArrayList<>();
        TreeNode curNode= root;
        Stack<TreeNode>   nodeStack = new Stack<>();
        while(curNode != null || !nodeStack.isEmpty()){
            while(curNode != null){
                nodeStack.push(curNode);
                curNode = curNode.left;
            }
            curNode = nodeStack.pop();
            resList.add(curNode.val);
            curNode = curNode.right;
        }
        return resList;
    }
}

//   ---   Recursion Method   ---

//public List<Integer> inorderTraversal(TreeNode root) {
//    List<Integer> res = new ArrayList<>();
//    if (root == null)
//        return res;
//    helperTraverse(root, res);
//    return res;
//}
//
//    private void helperTraverse(TreeNode curNode, List<Integer> res) {
//        if(curNode == null)
//            return;
//
//        helperTraverse(curNode.left, res);
//        res.add(curNode.val);
//        helperTraverse(curNode.right, res);
//    }