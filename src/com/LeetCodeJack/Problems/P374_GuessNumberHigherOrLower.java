package com.LeetCodeJack.Problems;

public class P374_GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        int middle = 0;
        int guess = 0;
        while(left <= right) {
            middle = left + (right - left)/2;
            guess = guess(middle);
            if(guess == 0)
                return middle;
            else if(guess == 1)
                left = middle + 1;
            else
                right = middle - 1;
        }
        return -1;
    }







    private int guess(int n){
        return 0;
    }
}
