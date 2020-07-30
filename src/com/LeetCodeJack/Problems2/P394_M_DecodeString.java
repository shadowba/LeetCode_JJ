package com.LeetCodeJack.Problems2;

import java.util.*;

public class P394_M_DecodeString {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        char[] sArr = s.toCharArray();
        for (char c : sArr) {
            if (c != ']')
                stack.push(c);
            else {
                StringBuilder sub = new StringBuilder();
                while (!stack.isEmpty() && Character.isLetter(stack.peek()))
                    sub.insert(0, stack.pop());
                stack.pop(); // Now we've reached '[', discard it.
                StringBuilder kSub = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek()))
                    kSub.insert(0, stack.pop());
                int count = Integer.valueOf(kSub.toString());
                char[] subArr = sub.toString().toCharArray();
                while (count > 0) {
                    for (char ch : subArr)
                        stack.push(ch);
                    count--;
                }
            }
        }
        StringBuilder resSb = new StringBuilder();
        while (!stack.isEmpty()) {
            resSb.insert(0, stack.pop());
        }
        return resSb.toString();
    }
}
