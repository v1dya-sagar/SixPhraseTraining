package com.SixPhrase.Day_3;

public class StrongNumber {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(isStrong(n) ? "Strong Number" : "Not a Strong Number");
    }
    public static int findFactorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean isStrong(int n){
        int sum = 0, t = n;
        while(t > 0){
            sum += findFactorial((t%10));
            t /= 10;
        }
        return sum == n;
    }
}
