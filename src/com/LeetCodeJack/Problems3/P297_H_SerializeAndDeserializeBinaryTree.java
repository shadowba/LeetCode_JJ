package com.LeetCodeJack.Problems3;

import java.util.*;

public class P297_H_SerializeAndDeserializeBinaryTree {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return serializeHelper(root);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] strArr = data.split(",");
        Queue<String> q = new LinkedList<>();
        for (String str : strArr) {
            if (!str.equals(""))
                q.offer(str);
        }
        return deSerializeHelper(q);
    }

    private String serializeHelper(TreeNode root) {
        if (root == null)
            return "null";

        String res = String.valueOf(root.val) + ",";
        res += serializeHelper(root.left) + ",";
        res += serializeHelper(root.right) + ",";
        return res;
    }

    private TreeNode deSerializeHelper(Queue<String> q) {
        if (q.isEmpty()) {
            return null;
        }
        if (q.peek().equals("null")) {
            q.poll();
            return null;
        }

        TreeNode cur = new TreeNode(Integer.parseInt(q.poll()));
        cur.left = deSerializeHelper(q);
        cur.right = deSerializeHelper(q);
        return cur;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
