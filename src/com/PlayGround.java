package com;

import com.LeetCodeJack.Problems2.*;
import com.LeetCodeJack.Problems.*;
import com.LeetCodeJack.Problems3.*;

import java.util.*;
public class PlayGround {
    public static void main(String[] args) {
        P201_M_BitwiseANDOfNumbersRange tester = new P201_M_BitwiseANDOfNumbersRange();
        int res = tester.rangeBitwiseAnd(20000, 2147483647);
        System.out.println(res);
    }
}
