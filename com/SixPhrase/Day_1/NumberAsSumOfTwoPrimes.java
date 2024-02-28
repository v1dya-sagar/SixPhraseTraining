package com.SixPhrase.Day_1;

import java.util.Scanner;

public class NumberAsSumOfTwoPrimes {
    public static void main(String[] args) {
        canExpressAsSumOf2Primes(10);
        canExpressAsSumOf2Primes(34);
        canExpressAsSumOf2Primes(43);
        canExpressAsSumOf2Primes(37);
        canExpressAsSumOf2Primes(29);
        canExpressAsSumOf2Primes(11);
    }

    public static void canExpressAsSumOf2Primes(int n) {
        if (n % 2 == 0) {
            System.out.println("yes");
            ;
        } else if (n % 2 != 0 && isPrime(n - 2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    public static boolean isPrime(int n){
        if (n <= 1)
            return false;

        if (n == 2 || n == 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i < Math.sqrt(n); i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }
//    isPrime(num)
//        if(num == 2 ){
//        return true;
//    }
//    int val = (int) Math.sqrt(num);
//        for(int i = 3;i<=val;i+=2){
//        if(num % i ==0 ){
//            return false;
//        }
//    }
//        return true;
//}
}


