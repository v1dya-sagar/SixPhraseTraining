package com.SixPhrase.Day_3;

public class AdamsNumber {
    public static void main(String[] args) {
//        A number is called an Adam number if the square of a number and
//        the square of its reverse are reverse to each other. Let's understand
//        it through an example.
        int n = 301;
        System.out.println(isAdam(n));


    }

    public static boolean isAdam(int n){
        int reverseSquare = square(reverse(n));
        int squareReverse = reverse(square(n));
        return reverseSquare == squareReverse;
    }
    public static int square(int n){
        return n*n;

    }

    public static int reverse(int n){
        int rem, num = 0;
        while(n>0){
            rem = n%10;
            num += rem;
            num*=10;
            n/=10;
        }
        return num/10;
    }
}
