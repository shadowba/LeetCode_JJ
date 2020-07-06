package com.LeetCodeJack.Problems;

import java.util.ArrayList;
import java.util.List;

public class P66_PlusOne {

    // Genius Method
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        if(digits[digits.length-1]<9){
            digits[digits.length-1] = digits[digits.length-1]+1;
            return digits;
        }

        for (int i = n - 1; i >= 0; i--) {
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] newDigits = new int[n+1];
        newDigits[0] = 1;
        return newDigits;
    }
}

// Normal Method
//public int[] plusOne(int[] digits) {
//    int carry = 0;
//    int result = 0;
//    List<Integer> arrList = new ArrayList<>();
//
//    if(digits[digits.length-1]<9){
//        digits[digits.length-1] = digits[digits.length-1]+1;
//        return digits;
//    }
//
//
//    int[] resArr = new int[digits.length];
//    for (int i = digits.length - 1; i >= 0; i--) {
//        if (i == digits.length - 1) {
//            result = (digits[i] + carry + 1) % 10;
//            carry = (digits[i] + carry + 1) / 10;
//        } else {
//            result = (digits[i] + carry) % 10;
//            carry = (digits[i] + carry) / 10;
//        }
//        resArr[i] = result;
//
//        if(i == 0 && carry == 1){
//            int[] finalArr = new int[resArr.length + 1];
//            finalArr[0] = carry;
//            for(int j =0; j<resArr.length; j++)
//                finalArr[j+1] = resArr[j];
//            return finalArr;
//        }
//    }
//    return resArr;
//}
