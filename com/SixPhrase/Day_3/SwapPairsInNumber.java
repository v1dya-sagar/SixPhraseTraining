package com.SixPhrase.Day_3;

import java.util.Scanner;

public class SwapPairsInNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), result = 0;
        //for starting from right
        int length =(int)Math.log10(n) + 1 - 2;
        System.out.println("length " + length);
        while(length >= 0){
            int powerValue = (int)Math.pow(10,length);
            System.out.println("powerValue " + powerValue);
            int reducedN = n / powerValue;
            System.out.println("reducedN " + reducedN);
            int firstDigit = (reducedN % 100) % 10;
            System.out.println("First digit " + firstDigit);

            int secondDigit = (reducedN % 100) / 10;
            System.out.println("Second digit " + secondDigit);

            result = result*100 + (firstDigit * 10 + secondDigit);
            System.out.println("result " + result);
            length -= 2;
            System.out.println("_________________________________________");
        }
        System.out.println(length == -1 ? ((result*10) + n%10) : result) ;
    }

//    for starting from left
//    public static int swapDigitPairs(int number) {
//        int result = 0;
//        int place = 1;
//        while (number > 9) {
//            result += place * 10 * (number % 10);
//            number /= 10;
//            result += place * (number % 10);
//            number /= 10;
//            place *= 100;
//        }
//        return result + place * number;
//    }
}
