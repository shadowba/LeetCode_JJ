package com.LeetCodeJack.Problems3;
import java.util.*;
public class P239_H_SlidingWindowMaximum {
    // Monotonic Deque
    // A monotonic Queue is a data structure the elements from
    // the front to the end is strictly either increasing or decreasing.

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length-k+1];
        // q只存储index
        Deque<Integer> q = new ArrayDeque<>(k);
        for(int i=0; i<nums.length; i++){
//            while(!q.isEmpty() && q.peek()<=i-k){
//                q.poll();
//            }
            while(!q.isEmpty()&& nums[i]>nums[q.peekLast()]){
                q.poll();
            }
            q.offer(nums[i]);
            if(i>=k-1){
                res[i-k+1] = q.peek();
            }
        }
        return res;
    }
}
