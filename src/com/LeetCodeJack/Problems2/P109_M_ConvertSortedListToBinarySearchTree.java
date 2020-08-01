package com.LeetCodeJack.Problems2;

import java.util.*;

public class P109_M_ConvertSortedListToBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> arrList = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            arrList.add(cur.val);
            cur = cur.next;
        }
        int N = arrList.size();
        return treeBuilder(arrList, 0, N - 1);
    }

    private TreeNode treeBuilder(List<Integer> arrList, int leftIdx, int rightIdx) {
        if (leftIdx > rightIdx)
            return null;
        if (leftIdx == rightIdx)
            return new TreeNode(arrList.get(leftIdx));
        int mid = leftIdx + (rightIdx - leftIdx) / 2;
        TreeNode head = new TreeNode(arrList.get(mid));
        head.left = treeBuilder(arrList, leftIdx, mid - 1);
        head.right = treeBuilder(arrList, mid + 1, rightIdx);
        return head;
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
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
