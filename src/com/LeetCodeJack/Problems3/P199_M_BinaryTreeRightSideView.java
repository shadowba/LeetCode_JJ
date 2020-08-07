package com.LeetCodeJack.Problems3;

import java.util.*;

public class P199_M_BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> resList = new ArrayList<>();
        if(root == null)
            return resList;
        Queue<TreeNode> q = new LinkedList<>();
        int size = 0;
        int level = 0;
        q.offer(root);
        TreeNode cur;
        while(!q.isEmpty()){
            size = q.size();
            level = q.size();
            while(size>0){
                cur = q.poll();
                if(level == size)
                    resList.add(cur.val);
                if(cur.right!= null) q.offer(cur.right);
                if(cur.left != null) q.offer(cur.left);
                size--;
            }
        }
        return resList;
    }

    private class TreeNode {
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
