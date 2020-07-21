package com.LeetCodeJack.Problems2;

public class P771_JewelsAndStones {
    final int ASCII_NUM = 256;
    public int numJewelsInStones(String J, String S) {
        char[] jewTable = new char[ASCII_NUM];
        char[] jewArr = J.toCharArray();
        char[] stoneArr = S.toCharArray();
        for(char ch: jewArr)
            jewTable[ch] = 1;

        int res = 0;
        for(char stone : stoneArr){
            if(jewTable[stone] == 1)
                res++;
        }
        return res;
    }
}
