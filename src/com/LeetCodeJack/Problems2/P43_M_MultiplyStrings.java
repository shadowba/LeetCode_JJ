package com.LeetCodeJack.Problems2;

public class P43_M_MultiplyStrings {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0"))
            return "0";
        int m = num1.length();
        int n = num2.length();
        int[] res = new int[m + n];
        int mul = 0;
        int p1 = 0;
        int p2 = 0;
        int sum = 0;
        for (int i = m -1; i>= 0; i--){
            for(int j = n -1; j>=0; j--){
                mul = (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
                p1 = i + j;
                p2 = i + j +1;
                sum = mul + res[p2];
                res[p2] = sum % 10;
                res[p1] += sum /10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for( int digit : res){
            if(!(sb.length()==0 && digit == 0))
                sb.append(digit);
        }
        return sb.toString();
    }
}
