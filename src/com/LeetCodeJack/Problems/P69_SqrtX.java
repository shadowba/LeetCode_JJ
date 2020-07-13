package com.LeetCodeJack.Problems;

public class P69_SqrtX {
    // Best Method
    public int mySqrt(int x) {
        int left = 0;
        int right = (int)Math.sqrt(Integer.MAX_VALUE);

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if(middle * middle == x) return middle;
            else if(x > middle * middle)
                left = middle + 1;
            else
                right = middle - 1;
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
