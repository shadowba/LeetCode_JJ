package com.LeetCodeJack.Problems;

public class P69_SqrtX {
    // Best Method
    public int mySqrt(int x) {
        int left = 0;
        int right = (int)Math.sqrt(Integer.MAX_VALUE);

        while (right > left + 1) {
            int middle = left + (right - left) / 2;
            if(middle * middle == x) return middle;
            else if(x > middle * middle)
                left = middle;
            else
                right = middle;
        }
        if(right * right <= x) return right;
        else
            return left;
    }

    // Nomal Method
//    public int mySqrt(int x) {
//        for(int i=0; i<46341; i++){
//            if(i*i==x)
//                return i;
//            else if(i*i>x)
//                return i-1;
//        }
//        return 46340;
//    }
}
