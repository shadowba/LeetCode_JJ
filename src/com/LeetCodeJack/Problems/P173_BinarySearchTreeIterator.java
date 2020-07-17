package com.LeetCodeJack.Problems;

import com.EssentialClasses.TreeNode;
import java.util.*;

public class P173_BinarySearchTreeIterator {
    Stack<TreeNode> nodeStack = new Stack<>();

    //   ---   Uncomment this constructor before submission   ---
//    public BSTIterator(TreeNode root) {
//        helperIteration(root, nodeStack);
//    }

    private void helperIteration(TreeNode cur, Stack<TreeNode> stack){
        if(cur == null)
            return;
        helperIteration(cur.right, stack);
        stack.add(cur);
        helperIteration(cur.left, stack);
    }

    /** @return the next smallest number */
    public int next() {
        return nodeStack.pop().val;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !nodeStack.isEmpty();
    }
}
