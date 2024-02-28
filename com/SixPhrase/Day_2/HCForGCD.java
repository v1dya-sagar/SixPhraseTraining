package com.SixPhrase.Day_2;

public class HCForGCD {
    public static void main(String[] args) {
        System.out.println(gcd(60, 80));
    }
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        } else {
            return gcd(b, b % a);
        }
    }
}
