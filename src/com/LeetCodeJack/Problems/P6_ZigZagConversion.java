package com.LeetCodeJack.Problems;

public class P6_ZigZagConversion {
    public String convert(String s, int numRows) {
        if (s == null || s.length() == 0 || numRows == 0)
            return "";
        if (numRows == 1)
            return s;

        StringBuilder strRes = new StringBuilder();
        int row = 0;
        int cycleLen = 2 * (numRows - 1);
        int i = 0;
        while (row < numRows) {
            if (row == 0 || row == numRows -1) {
                i = row;
                while (i < s.length() ) {
                    strRes.append(s.charAt(i));
                    i += cycleLen;
                }
                row++;
                continue;
            } else {
                i = row;
                while (i < s.length()) {
                    strRes.append(s.charAt(i));
                    if(i + (cycleLen - row * 2) < s.length())
                        strRes.append(s.charAt(i + (cycleLen - row * 2)));
                    i += cycleLen;
                }
            }
            row++;
        }
        return strRes.toString();
    }
}
