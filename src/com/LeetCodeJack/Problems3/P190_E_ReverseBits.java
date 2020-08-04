package com.LeetCodeJack.Problems3;

public class P190_E_ReverseBits {
    // you need treat n as an unsigned value

    public int reverseBits(int n) {

        // 00000010100101000001111010011100
        // 00111001011110000010100101000000

        if (n == 0)
            return 0;
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res <<= 1;
            if ((n & 1) == 1) res += 1;
            n >>= 1;
        }
        return res;
    }
}
