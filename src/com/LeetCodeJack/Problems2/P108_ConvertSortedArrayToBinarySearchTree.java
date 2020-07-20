package com.LeetCodeJack.Problems2;

import com.EssentialClasses.TreeNode;

public class P108_ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0)
            return null;
        return treeBuilder(nums, 0, nums.length - 1);
    }

    private TreeNode treeBuilder(int[] nums, int low, int high){
        if(low > high)
            return null;

        int mid = low + (high - low) / 2;
        TreeNode root = new TreeNode (nums[mid]);

        root.right = treeBuilder(nums, mid + 1, high);
        root.left = treeBuilder(nums, low, mid - 1);
        return root;
    }
}
