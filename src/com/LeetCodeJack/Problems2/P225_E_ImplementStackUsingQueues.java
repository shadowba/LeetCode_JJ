package com.LeetCodeJack.Problems2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class P225_E_ImplementStackUsingQueues {
    Queue<Integer> q;
    /** Initialize your data structure here. */
    public P225_E_ImplementStackUsingQueues() { //MyStack
        q = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        int sz = q.size();
        q.offer(x);
        while(sz > 0){
            q.offer(q.poll());
            sz--;
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return q.poll();
    }

    /** Get the top element. */
    public int top() {
        return q.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.isEmpty();
    }
}
