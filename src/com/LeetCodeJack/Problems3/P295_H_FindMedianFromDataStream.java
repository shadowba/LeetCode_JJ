package com.LeetCodeJack.Problems3;
import java.util.*;
public class P295_H_FindMedianFromDataStream {
    int minSize, maxSize;
    Queue<Integer> minHeap;
    Queue<Integer> maxHeap;
    /** initialize your data structure here. */
    public P295_H_FindMedianFromDataStream() {
        minSize=0;
        maxSize=0;
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>((a,b)->b-a);
    }

    public void addNum(int num) {
        if(maxSize==0){
            maxHeap.offer(num);
            maxSize++;
            return;
        }
        if(minSize==0){
            if(num>=maxHeap.peek()){
                minHeap.offer(num);
                minSize++;
            }else{
                maxHeap.offer(num);
                minHeap.offer(maxHeap.poll());
                minSize++;
            }
            return;
        }
        if(num<maxHeap.peek()){
            maxHeap.offer(num);
            maxSize++;
        }
        else{
            minHeap.offer(num);
            minSize++;
        }
        balance();
    }

    public double findMedian() {
        if(minSize==maxSize)
            return ((double)minHeap.peek()+(double)maxHeap.peek())/2.0;
        else
            return (minSize>maxSize)?minHeap.peek():maxHeap.peek();
    }
    private void balance(){
        if(Math.abs(maxSize-minSize)<=1) return;
        if(maxSize-minSize>1){
            minHeap.offer(maxHeap.poll());
            maxSize--;
            minSize++;
        }
        if(minSize-maxSize>1){
            maxHeap.offer(minHeap.poll());
            maxSize++;
            minSize--;
        }
    }
}
