package com.LeetCodeJack.Problems3;

import java.util.*;

public class P166_M_FractionToRecurringDecimal {
    public String fractionToDecimal(int numerator, int denominator) {

        if (numerator == 0)
            return "0";
        StringBuilder sb = new StringBuilder();
        String sign = ((numerator > 0) ^ (denominator > 0)) ? "-" : "";
        sb.append(sign);
        long num = Math.abs((long)numerator);
        long den = Math.abs((long)denominator);
        sb.append(num / den);
        if (num % den == 0)
            return sb.toString();

        num %= den;
        sb.append(".");
        Map<Long, Integer> map = new HashMap<>();

        map.put(num, sb.length());

        while (num != 0) {
            num *= 10;
            sb.append(num/ den);
            num = num % den;
            if (map.containsKey(num)) {
                int idx = map.get(num);
                sb.insert(idx, "(");
                sb.append(")");
                break;
            } else {
                map.put(num, sb.length());
            }
        }
        return sb.toString();
    }
}
