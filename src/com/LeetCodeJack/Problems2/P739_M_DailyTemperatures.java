package com.LeetCodeJack.Problems2;
import java.util.*;
public class P739_M_DailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> tempStack = new Stack<>();
        Stack<Integer> idxStack = new Stack<>();
        int size = T.length;
        int[] resArr = new int[size];
        int idx = 0;
        while(idx < size){

            while(!tempStack.isEmpty()&&T[idx] > tempStack.peek()){
                tempStack.pop();
                resArr[idxStack.peek()] = idx - idxStack.peek();
                idxStack.pop();
            }
            tempStack.push(T[idx]);
            idxStack.push(idx);
            idx++;
        }
        while(!idxStack.isEmpty()){
            resArr[idxStack.pop()] = 0;
        }
        return resArr;
    }
}
