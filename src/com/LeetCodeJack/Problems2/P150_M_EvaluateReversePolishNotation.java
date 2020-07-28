package com.LeetCodeJack.Problems2;

import java.util.*;

public class P150_M_EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> polishStack = new Stack<>();

        Map<String, Integer> operatorMap = new HashMap<>();
        operatorMap.put("+", 1);
        operatorMap.put("-", 2);
        operatorMap.put("*", 3);
        operatorMap.put("/", 4);
        // String[] operators = {"+", "-", "*", "/"};
        // Set<String> operatorSet = new HashSet<>(Arrays.asList(operators));
        int N = tokens.length;
        int idx = 0;
        int sum = 0;
        String num;
        int temp = 0;
        while (idx < N) {
            if (!operatorMap.containsKey(tokens[idx]))
                polishStack.push(Integer.valueOf(tokens[idx]));
            else {
                switch (operatorMap.get(tokens[idx])) {
                    case 1:
                        temp = polishStack.pop();
                        sum = polishStack.pop() + temp;
                        break;
                    case 2:
                        temp = polishStack.pop();
                        sum = polishStack.pop() - temp;
                        break;
                    case 3:
                        temp = polishStack.pop();
                        sum = polishStack.pop() * temp;
                        break;
                    case 4:
                        temp = polishStack.pop();
                        sum = polishStack.pop() / temp;
                        break;
                }
                polishStack.push(sum);
            }
            idx++;
        }
        return polishStack.pop();
    }
}
