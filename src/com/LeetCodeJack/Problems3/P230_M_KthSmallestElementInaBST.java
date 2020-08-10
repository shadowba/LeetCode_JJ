package com.LeetCodeJack.Problems3;

import java.util.*;

public class P230_M_KthSmallestElementInaBST {
    
    //    利用 BST 的特性，中序遍历即可得到一个sorted 数列，所以只要依次记录中序遍历就可以找到第K小的节点

    public int kthSmallest(TreeNode root, int k) {
        if (root == null)
            return 0;
        int count = 0;
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || cur != null) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            if (++count == k)
                return cur.val;
            else
                cur = cur.right;
        }
        return cur.val;
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
