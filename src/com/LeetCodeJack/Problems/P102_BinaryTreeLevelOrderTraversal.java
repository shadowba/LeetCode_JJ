package com.LeetCodeJack.Problems;

import com.EssentialClasses.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class P102_BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if(root == null) return res;

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            LinkedList<Integer> list = new LinkedList<>();
            for (int i = 0; i<size; i++){
                TreeNode node = queue.pop();
                list.add(node.val);
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
            res.add(list);
        }
        return res;
    }
}

//            ---  Recursive Method ---
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> res = new ArrayList<>();
//        if (root == null)
//            return res;
//        helperLevel(root, 0, res);
//        return res;
//    }
//
//    private void helperLevel(TreeNode node, int curLevel, List<List<Integer>> res) {
//        if (node == null)
//            return;
//        if (curLevel > res.size() - 1)
//            res.add(curLevel, new ArrayList<Integer>());
//        res.get(curLevel).add(node.val);
//        helperLevel(node.left, curLevel + 1, res);
//        helperLevel(node.right, curLevel + 1, res);
//    }
