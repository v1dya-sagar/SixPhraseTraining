package com.SixPhrase.Day_2;

import com.SixPhrase.Day_1.NumberAsSumOfTwoPrimes;

public class PrimeFactors {
    public static void main(String[] args) {
        int n = 100;
        for(int i = 2 ; i < Math.sqrt(n); i++){
            if(NumberAsSumOfTwoPrimes.isPrime(i) && n%i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
