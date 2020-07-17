package com.LeetCodeJack.Problems;
import com.EssentialClasses.Node;
public class P116_PopulatingNextRightPointersInEachNode {
    public Node connect(Node root) {
        if(root == null) return null;
        Node levelStart = root;
        Node cur = levelStart;
        while(levelStart != null){
            cur = levelStart;
            while(cur != null){
                if(cur.left != null)
                    cur.left.next = cur.right;

                if(cur.right != null && cur.next != null)
                    cur.right.next = cur.next.left;
                cur = cur.next;
            }
            levelStart = levelStart.left;
        }
        return root;
    }
}
