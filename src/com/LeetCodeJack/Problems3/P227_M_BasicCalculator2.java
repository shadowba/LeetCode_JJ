package com.LeetCodeJack.Problems3;

import java.util.*;

public class P227_M_BasicCalculator2 {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        char[] sArr = s.toCharArray();
        int res = 0;

        int val = 0;
        char op = '+';
        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] >= '0') {
                val = val * 10 + (sArr[i] - '0');
            }
            if (sArr[i] < '0' && sArr[i] != ' ' || i== sArr.length-1) {
                if (op == '+') stack.push(val);
                if (op == '-') stack.push(-val);
                if (op == '*' || op == '/'){
                    int temp = (op == '*') ? (stack.peek() * val) : (stack.peek() / val);
                    stack.pop();
                    stack.push(temp);
                }
                op = sArr[i];
                val=0;
            }
        }
        while(!stack.isEmpty())
            res +=stack.pop();

        return res;
    }
}
