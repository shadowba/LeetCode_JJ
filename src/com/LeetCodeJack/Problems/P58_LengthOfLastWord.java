package com.LeetCodeJack.Problems;

public class P58_LengthOfLastWord {
    //    从尾部开始遍历
    public int lengthOfLastWord(String s) {
        s = s.trim();
        if (s == null || s.length() == 0)
            return 0;


        char[] strArr = s.toCharArray();
        int lastIdx = strArr.length - 1;
        int lastLength = 1;
        while (lastIdx > -1) {
            if (lastIdx > 0 && strArr[lastIdx] == ' ' && strArr[lastIdx + 1] != ' ') {
                break;
            }
            lastIdx--;
        }

        return strArr.length - 1 - lastIdx;
    }
}
//从头开始遍历的方法
//    public int lengthOfLastWord(String s) {
//        s = s.trim();
//        if (s == null || s.length() == 0)
//            return 0;
//
//        int left = 0;
//        int right = 0;
//        int lastLength = 1;
//        char[] strArr = s.toCharArray();
//        while (right < strArr.length) {
//            if (right > 0 && strArr[right] != ' ' && strArr[right - 1] == ' ') {
//                left = right;
//            }
//            right++;
//        }
//        lastLength = right - left;
//        return lastLength;
//    }
