package com.LeetCodeJack.Problems;

public class P13_RomanToInteger {
    public int romanToInt(String s) {
        if (s == null || s == "" || s == " ")
            return 0;
        final int ALPHABET_SIZE = 26;
        char[] inputChar = s.toCharArray();
        final int N = s.length();
        int[] romanTable = new int[ALPHABET_SIZE];

        romanTable['I' - 'A'] = 1;
        romanTable['V' - 'A'] = 5;
        romanTable['X' - 'A'] = 10;
        romanTable['L' - 'A'] = 50;
        romanTable['C' - 'A'] = 100;
        romanTable['D' - 'A'] = 500;
        romanTable['M' - 'A'] = 1000;

        int result = 0;
        int sign = 1;

        for (int i = 0; i < N; i++) {
            if (i + 1 < N)
                sign = (romanTable[s.charAt(i)-'A'] >= romanTable[s.charAt(i+1)-'A']) ? 1 : -1;
            else
                sign = 1;

            result = romanTable[s.charAt(i) - 'A'] * sign + result;
        }
        return result;
    }
}
