package com.LeetCodeJack.Problems2;

public class P622_DesignCircularQueue {
    int size;
    int head;
    int tail;
    int k;
    int[] data;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public P622_DesignCircularQueue(int k) {  //  MyCircularQueue
        this.k = k;
        this.data = new int[k];
        size = 0;
        head = tail = -1;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(!isFull()){
            head = (size == 0) ? head+1: head;
            tail = (tail + 1 <= k - 1) ? tail + 1 : tail + 1 - k ;
            data[tail] = value;
            size++;
            return true;
        }
        return false;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(!isEmpty()){
            head = (head + 1 <= k - 1) ? head + 1 : head + 1 - k ;
            size--;
            if(isEmpty())
                head = tail = -1;
            return true;
        }
        return false;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if(!isEmpty())
            return data[head];
        return -1;
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if(!isEmpty())
            return data[tail];
        return -1;
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return (size == 0) ? true : false;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return (size == k) ? true : false;
    }
}
