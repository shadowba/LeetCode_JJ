package com.LeetCodeJack.Problems;
import com.EssentialClasses.TreeNode;

import java.util.*;

public class P145_BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> resList = new LinkedList<>();
        Stack<TreeNode> nodeStack = new Stack<>();

        TreeNode cur = root;
        while(cur != null || !nodeStack.isEmpty()){
            if(cur != null){
                resList.addFirst(cur.val);
                nodeStack.push(cur);
                cur = cur.right;
            }else{
                cur = nodeStack.pop();
                cur = cur.left;
            }
        }
        return resList;
    }
}

//   ---   Recursion Method   ---

//    public List<Integer> postorderTraversal(TreeNode root) {
//        List<Integer> resList = new ArrayList<>();
//        helperPostOrder(root, resList);
//        return resList;
//    }
//
//    private void helperPostOrder(TreeNode cur, List<Integer> resList){
//        if(cur == null)
//            return;
//        helperPostOrder(cur.left, resList);
//        helperPostOrder(cur.right, resList);
//        resList.add(cur.val);
//    }