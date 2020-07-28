package com.LeetCodeJack.Problems2;

import java.util.Stack;

public class P232_E_ImplementQueueUsingStacks {
    Stack<Integer> stack;
    Stack<Integer> tempStack;
    /** Initialize your data structure here. */
    public P232_E_ImplementQueueUsingStacks() {
        stack = new Stack<>();
        tempStack = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);

    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int sz = stack.size();
        int res;
        while(sz > 0){
            tempStack.push(stack.pop());
            sz--;
        }
        res = tempStack.pop();
        sz = tempStack.size();
        while(sz > 0){
            stack.push(tempStack.pop());
            sz--;
        }
        return res;
    }

    /** Get the front element. */
    public int peek() {
        int sz = stack.size();
        int res;
        while(sz > 0){
            tempStack.push(stack.pop());
            sz--;
        }
        res = tempStack.peek();
        sz = tempStack.size();
        while(sz > 0){
            stack.push(tempStack.pop());
            sz--;
        }
        return res;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }
}
