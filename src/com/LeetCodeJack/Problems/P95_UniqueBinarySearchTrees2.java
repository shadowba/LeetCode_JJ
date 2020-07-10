package com.LeetCodeJack.Problems;

import com.EssentialClasses.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P95_UniqueBinarySearchTrees2 {
    public List<TreeNode> generateTrees(int n) {
        if (n < 1)
            return new ArrayList<>();
        return generateRoot(1, n);
    }

    public List<TreeNode> generateRoot(int low, int high) {
        List<TreeNode> ans = new ArrayList<>();
        if (low > high) {
            return ans;
        }

        for (int i = low; i <= high; i++) {
            List<TreeNode> leftSubTree = (List<TreeNode>) generateRoot(low, i - 1);
            List<TreeNode> rightSubTree = (List<TreeNode>) generateRoot(i + 1, high);
            if(leftSubTree.size() == 0 &&rightSubTree.size() == 0){
                TreeNode root = new TreeNode(i);
                ans.add(root);
            } else if (leftSubTree.size() == 0) {
                for (TreeNode right : rightSubTree) {
                    TreeNode root = new TreeNode(i);
                    root.right = right;
                    ans.add(root);
                }
            } else if (rightSubTree.size() == 0){
                for (TreeNode left: leftSubTree){
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    ans.add(root);
                }
            }else{
                for (TreeNode left: leftSubTree){
                    for (TreeNode right : rightSubTree) {
                        TreeNode root = new TreeNode(i);
                        root.left = left;
                        root.right = right;
                        ans.add(root);
                    }
                }
            }
        }
        return ans;
    }
}
