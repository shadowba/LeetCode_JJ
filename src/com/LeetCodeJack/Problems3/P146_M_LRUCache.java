package com.LeetCodeJack.Problems3;
import java.util.*;
public class P146_M_LRUCache {
    final Node head = new Node();
    final Node tail = new Node();
    Map<Integer, Node> nodeMap;
    int maxSize;

    public P146_M_LRUCache(int capacity) {
        nodeMap = new HashMap<>();
        maxSize = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        int result = -1;
        Node node = nodeMap.get(key);
        if(node != null){
            result = node.val;
            remove(node);
            add(node);
        }
        return result;
    }

    public void put(int key, int value) {
        Node node = nodeMap.get(key);
        if(node != null){
            remove(node);
            node.val = value;
            add(node);
        }else{
            if(nodeMap.size() == maxSize){
                nodeMap.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node newNode = new Node();
            newNode.key = key;
            newNode.val = value;

            nodeMap.put(key,newNode);
            add(newNode);
        }
    }

    public void add(Node node){
        Node headNext = head.next;
        head.next = node;
        node.prev = head;
        node.next = headNext;
        headNext.prev = node;
    }

    public void remove(Node node){
        Node prevNode = node.prev;
        Node nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    private class Node{
        int key;
        int val;
        Node next;
        Node prev;
    }
}
