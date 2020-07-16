package com.LeetCodeJack.Problems;

import com.EssentialClasses.TreeNode;

public class P101_SymmetricTree {
        public boolean isSymmetric(TreeNode root) {
            if (root == null)
                return true;
            return helperSymm(root.left, root.right);
        }

        private boolean helperSymm(TreeNode left, TreeNode right) {
            if(left == null && right == null)
                return true;
            if (left == null || right == null)
                return false;
            if (left.val != right.val)
                return false;
            return helperSymm(left.left, right.right) && helperSymm(left.right, right.left);
        }
}
