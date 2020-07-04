package com.LeetCodeJack.Problems;

public class P8_StringToInteger {
    char[] numsTable = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public int myAtoi(String str) {
        str = str.trim();
        if (str == null || str.length() == 0)
            return 0;

        long res = 0;
        int N = str.length();
        boolean isPositive = true;
        int index = 0;
        if (str.charAt(0) == '-') {
            isPositive = false;
            index = 1;
        } else if (str.charAt(0) == '+') {
            isPositive = true;
            index = 1;
        }
        
        while (index < N) {
            if (!isDigit(str.charAt(index)))
                break;
            if (isPositive && ((res == Integer.MAX_VALUE / 10 && parseChar(str.charAt(index)) > 7) || (res > Integer.MAX_VALUE / 10))) {
                return Integer.MAX_VALUE;
            } else if (!isPositive && ((res == Integer.MAX_VALUE / 10 && parseChar(str.charAt(index)) > 8) || (res > Integer.MAX_VALUE / 10))) {
                return Integer.MIN_VALUE;
            }
            res = parseChar(str.charAt(index)) + res * 10;
            index++;
        }

        if (!isPositive)
            res = res * -1;

        return (int) res;
    }

    private boolean isDigit(char ch) {
        if (ch - '0' >= 0 && ch - '0' < 10)
            return true;
        return false;
    }

    private int parseChar(char ch) {
        return numsTable[ch - '0'];
    }
}
