package com.LeetCodeJack.Problems;

import com.EssentialClasses.Node;

public class P117_PopulatingNextRightPointersInEachNode2 {
    public Node connect(Node root) {
        Node prev = null;
        Node head = null;
        Node cur = root;

        while (cur != null){
            while (cur != null){
                if(cur.left != null){
                    if(prev != null)
                        prev.next = cur.left;
                    else
                        head = cur.left;

                    prev = cur.left;
                }

                if(cur.right != null){
                    if(prev != null)
                        prev.next = cur.right;
                    else
                        head = cur.right;
                    prev = cur.right;
                }
                cur = cur.next;
            }

            cur = head;
            head = null;
            prev = null;
        }

        return root;
    }
}
