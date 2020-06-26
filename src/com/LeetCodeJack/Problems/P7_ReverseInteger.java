package com.LeetCodeJack.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class P7_ReverseInteger {
    public int reverse(int x) {
        int pop = 0;
        int rev = 0;
        while (x != 0) {
            pop = x % 10;
            x = x / 10;

            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
                return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8 ))
                return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

//    public int reverse(int x) {
//        if(x==0)
//            return 0;
//
//        char[] inputChar = Integer.toString(x).toCharArray();
//        Stack<Character> temp = new Stack<>();
//        ArrayList<Integer> outputArray=new ArrayList<>();
//        for(char eachMember:inputChar){
//            if(eachMember=='-')
//                continue;
//            temp.push(eachMember);
//        }
//
//
//        while(!temp.isEmpty()){
//            if(temp.peek()=='0'||temp.peek()=='-') {
//                temp.pop();
//                continue;
//            }
//            outputArray.add(temp.pop()-'0');
//        }
//        System.out.println(outputArray.toString());
//
//        int result=0;
//        int size=outputArray.size();
//
//        for(int i=0;i<outputArray.size();i++){
//            result= (int) (outputArray.get(i)*(Math.pow(10,--size))+result);
//            System.out.println(result);
//        }
//        if(x<0)
//            result=result*-1;
//        return result;
//
//    }
}
