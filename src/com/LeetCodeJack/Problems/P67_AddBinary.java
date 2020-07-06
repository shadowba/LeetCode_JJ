package com.LeetCodeJack.Problems;

public class P67_AddBinary {
//      Best Method

    public String addBinary(String a, String b) {
        int m = a.length() - 1;
        int n = b.length() - 1;
        int sum = 0;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (m >= 0 || n >= 0) {
            sum = carry;
            if (m >= 0) sum += a.charAt(m) - '0';
            if (n >= 0) sum += b.charAt(n) - '0';
            carry = sum / 2;
            sum = sum % 2;
            sb.append(sum - '0');
            m--;
            n--;
        }
        if (carry == 1)
            sb.append('1');
        return sb.reverse().toString();
    }
}

//  Normal Method

//    public String addBinary(String a, String b) {
//        if (b.length() == 0)
//            return a;
//
//        int m = a.length();
//        int n = b.length();
//        int res = 0;
//        int carry = 0;
//        String str = "";
//        for (int i = 0; i < Math.min(m, n); i++) {
//            res = (a.charAt(m - 1 - i) - '0') + (b.charAt(n - 1 - i) - '0') + carry;
//            carry = res / 2;
//            res = res % 2;
//            str = (char) (res + '0') + str;
//        }
//        if (m > n) {
//            for (int i = m - n - 1; i >= 0; i--) {
//                res = (a.charAt(i) - '0') + carry;
//                carry = res / 2;
//                res = res % 2;
//                str = (char) (res + '0') + str;
//            }
//        } else {
//            for (int i = n - m - 1; i >= 0; i--) {
//                res = (b.charAt(i) - '0') + carry;
//                carry = res / 2;
//                res = res % 2;
//                str = (char) (res + '0') + str;
//            }
//        }
//        if (carry == 1)
//            str = '1' + str;
//        return str;
//    }
