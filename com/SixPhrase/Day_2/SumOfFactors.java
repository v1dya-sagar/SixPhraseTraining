package com.SixPhrase.Day_2;

import java.util.Scanner;

public class SumOfFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sum = sumOfFactors(n);
        System.out.println("Sum of factors of " + n + " (excluding itself) is: " + sum);
    }

    public static int sumOfFactors(int n) {
        int sum = 1; // Start with 1 to include 1 as a factor
        System.out.println(Math.sqrt(n));
        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                sum += i;
                if (i != n / i) { // If the divisor is not a square root
                    sum += n / i;
                }
            }
        }
        return sum;
    }
}
