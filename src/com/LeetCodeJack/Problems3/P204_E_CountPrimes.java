package com.LeetCodeJack.Problems3;

public class P204_E_CountPrimes {
    public int countPrimes(int n) {
        boolean[] notPrimes = new boolean[n];
        int count = 0;
        for(int i = 2; i< n; i++){
            if(notPrimes[i] == false){
                count++;
                for(int j =2; i*j<n; j++){
                    notPrimes[i*j]=true;
                }
            }
        }
        return count;
    }
}