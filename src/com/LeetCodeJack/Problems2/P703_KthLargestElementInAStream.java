package com.LeetCodeJack.Problems2;

import java.util.PriorityQueue;

public class P703_KthLargestElementInAStream {
    int k;
    PriorityQueue<Integer> q;

    public P703_KthLargestElementInAStream(int k, int[] nums) {
        q = new PriorityQueue<>(k);
        this.k = k;
        for (int num : nums)
            add(num);
    }

    public int add(int val) {
        if (q.size() < k)
            q.offer(val);
        else if (q.peek() < val) {
            q.poll();
            q.offer(val);
        }
        return q.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */

//TreeNode root;
//    int k;
//    public P703_KthLargestElementInAStream(int k, int[] nums) {
//        this.k = k;
//        for(int num : nums)
//            root = insert(root, num);
//    }
//
//    public int add(int val) {
//        insert(root,val);
//        return findKthLargest();
//    }
//
//    private TreeNode insert(TreeNode root, int num){
//        if(root == null)
//            return new TreeNode(num);
//        root.cnt++;
//        if(num >= root.val)
//            root.right = insert(root.right, num);
//        else
//            root.left = insert(root.left, num);
//        return root;
//    }
//
//    private int findKthLargest(){
//        int count = k;
//        TreeNode walker = root;
//
//        while (count > 0) {
//            int pos = 1 + (walker.right != null ? walker.right.cnt : 0);
//            if (count == pos) break;
//            if (count > pos) {
//                count -= pos;
//                walker = walker.left;
//            } else if (count < pos)
//                walker = walker.right;
//        }
//        return walker.val;
//    }
//
//private class TreeNode{
//    int val, cnt = 1;
//    TreeNode left, right;
//    TreeNode(int v){
//        val = v;
//    }
//}