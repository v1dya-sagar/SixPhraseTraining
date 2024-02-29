package com.SixPhrase.Day_2;
import java.util.Scanner;

public class TrailingZeroesFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = 5;
        int trailingSum= 0;
        while(num1<=num){
            trailingSum += num/num1;
            num1*=5;
        }
        System.out.println(trailingSum);
    }
}