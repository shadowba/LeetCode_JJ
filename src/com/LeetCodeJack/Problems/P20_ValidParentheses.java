package com.LeetCodeJack.Problems;

import java.util.HashMap;
import java.util.Stack;
import java.util.Map;

public class P20_ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() == 0 || s == null)
            return true;

        Stack<Character> parenthesesStack = new Stack<>();
        Map<Character, Character> parenthesesMap = new HashMap<>();

        char[] strArr = s.toCharArray();
        parenthesesMap.put(')', '(');
        parenthesesMap.put('}', '{');
        parenthesesMap.put(']', '[');
//        char[] frontParentheses = {'(','{','['};
//        char[] backParentheses = {')','}',']'};

        int index = 0;

        while (index < s.length()) {
            if (parenthesesMap.containsValue(strArr[index])) {
                parenthesesStack.push(strArr[index++]);
                continue;
            } else if (parenthesesMap.containsKey(strArr[index])) {
                if (parenthesesStack.isEmpty()|| parenthesesMap.get(strArr[index]) != parenthesesStack.peek())
                    return false;
                parenthesesStack.pop();
                index++;
            }
        }

        return parenthesesStack.isEmpty()?true:false;
    }
}
