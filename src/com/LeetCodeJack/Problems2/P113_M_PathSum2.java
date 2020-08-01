package com.LeetCodeJack.Problems2;

import java.util.*;

public class P113_M_PathSum2 {
    List<List<Integer>> resList = new ArrayList<>();
    int target;

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        target = sum;
        List<Integer> sumList = new ArrayList<>();
        int curSum = 0;
        helperSum(root, curSum, sumList);
        return resList;
    }

    private void helperSum(TreeNode cur, int curSum, List<Integer> sumList) {
        if (cur == null)
            return;
        if (isLeaf(cur)) {
            sumList.add(cur.val);
            if (curSum + cur.val == target) {
                resList.add(new ArrayList<>(sumList));
            }
            sumList.remove(sumList.size() - 1);
            return;
        }
        curSum += cur.val;
        sumList.add(cur.val);
        helperSum(cur.left, curSum, sumList);
        helperSum(cur.right, curSum, sumList);
        curSum -= cur.val;
        sumList.remove(sumList.size() - 1);
    }

    private boolean isLeaf(TreeNode node) {
        return (node.left == null && node.right == null);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
