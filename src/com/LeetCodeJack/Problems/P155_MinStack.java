package com.LeetCodeJack.Problems;

import java.util.Stack;

public class P155_MinStack {

    /**
     * initialize your data structure here.
     */
//     --- Better Code ---
    Stack<Integer> minStack= new Stack<>();
    Stack<Integer> valStack= new Stack<>();

    public void push(int x) {
        if (valStack.isEmpty() || x<= minStack.peek()) {
            minStack.push(x);
        }
        valStack.push(x);
    }

    public void pop() {
        if(minStack.peek().equals(valStack.peek()) ){
            minStack.pop();
        }
        valStack.pop();
    }

    public int top() {
        return valStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */



//       --- 1st Try ---
//    Stack<Integer> minStack;
//    Stack<Integer> valStack;
//    int curMin = Integer.MAX_VALUE;
//
//    public MinStack() {
//        minStack = new Stack<>();
//        valStack = new Stack<>();
//    }
//
//    public void push(int x) {
//        if (valStack.isEmpty() && minStack.isEmpty()) {
//            valStack.push(x);
//            curMin = x;
//            minStack.push(curMin);
//        } else {
//            valStack.push(x);
//            curMin = Math.min(minStack.peek(), x);
//            minStack.push(curMin);
//        }
//    }
//
//    public void pop() {
//        valStack.pop();
//        minStack.pop();
//    }
//
//    public int top() {
//        return valStack.peek();
//    }
//
//    public int getMin() {
//        return minStack.peek();
//    }