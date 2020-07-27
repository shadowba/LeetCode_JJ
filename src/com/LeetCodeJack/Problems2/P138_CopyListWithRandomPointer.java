package com.LeetCodeJack.Problems2;

import java.util.*;

public class P138_CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        if(head == null)
            return null;
        HashMap<Node, Node> nodeMap = new HashMap<>();
        Node cur = head;

        while(cur != null){
            nodeMap.put(cur, new Node(cur.val));
            cur = cur.next;
        }

        cur = head;
        Node newHead = nodeMap.get(head);
        Node newCur = newHead;
        while(cur != null){
            newCur.next = nodeMap.get(cur.next);
            newCur.random = nodeMap.get(cur.random);
            cur = cur.next;
            newCur = newCur.next;
        }
        return newHead;
    }

    private class Node {
        int val;
        Node next;
        Node random;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
