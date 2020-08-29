package com.LeetCodeJack.Problems3;

import java.util.*;

public class P273_H_IntegerToEnglishWords {
    String[] lessThanTwenty = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    String[] thounsands = {"", "Thousand", "Million", "Billion"};

    public String numberToWords(int num) {
        if(num==0)
            return "Zero";
        StringBuilder sb = new StringBuilder();

        int thou = 0;
        while (num != 0) {
            if(num%1000!=0)
                sb.insert(0,helper(num%1000) + thounsands[thou] + " ");
            num /=1000;
            thou++;
        }
        return sb.toString().trim();
    }

    private String helper(int num) {
        if (num == 0)
            return "";
        else if (num < 20)
            return lessThanTwenty[num] + " ";
        else if (num < 100)
            return tens[num / 10] + " " + helper(num % 10);
        else
            return lessThanTwenty[num / 100] + " Hundred " + helper(num % 100);
    }
}
