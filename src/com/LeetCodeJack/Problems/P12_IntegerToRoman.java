package com.LeetCodeJack.Problems;

import java.util.HashMap;

public class P12_IntegerToRoman {
    public String intToRoman(int num) {
        int pop = 0;
        int digit = 1;
        int result = 0;
        String romanStr = "";
        String romanSeg = "";

        HashMap<Integer, String> romanTable = new HashMap<>();
        romanTable.put(0, "");
        romanTable.put(1, "I");
        romanTable.put(5, "V");
        romanTable.put(10, "X");
        romanTable.put(50, "L");
        romanTable.put(100, "C");
        romanTable.put(500, "D");
        romanTable.put(1000, "M");
        romanTable.put(4, "IV");
        romanTable.put(9, "IX");
        romanTable.put(40, "XL");
        romanTable.put(90, "XC");
        romanTable.put(400, "CD");
        romanTable.put(900, "CM");

        while (num != 0) {
            pop = num % 10;
            num /= 10;
            result = digit * pop;

            if (romanTable.containsKey(result)) {
                romanStr = romanTable.get(result) + romanStr;
                digit = digit * 10;
                continue;
            }

            if (pop > 1 && pop < 5) {
                romanSeg = "";
            } else {
                romanSeg = romanTable.get(5 * digit);
            }

            for (int i = pop%5; i > 0; i--) {
                romanSeg = romanSeg + romanTable.get(1 * digit);
            }

            romanStr = romanSeg + romanStr;
            digit = digit * 10;
        }
        return romanStr;
    }
}
