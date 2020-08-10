package com.LeetCodeJack.Problems3;

public class P231_E_PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        int cnt = 0;
        while (n > 0) {
            cnt += (n & 1);
            n >>= 1;
        }
        return cnt == 1;
    }

//    public boolean isPowerOfTwo(int n) {
//        if(n==0 || n==-2147483648)
//            return false;
//        int res = 0;
//        int count = (n>0)?0:1;
//        n = Math.abs(n);
//        for (int i = 31; i > 0; i--) {
//            res = n & 1;
//            n >>= 1;
//            if (res == 1)
//                count++;
//            if (count > 1)
//                return false;
//        }
//        return (count == 1) ? true : false;
//    }
}
