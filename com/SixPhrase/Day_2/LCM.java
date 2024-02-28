package com.SixPhrase.Day_2;

import com.SixPhrase.Day_2.*;

public class LCM {
    public static void main(String[] args) {
        System.out.println(lcm(10, 6));
    }
    public static int lcm(int a, int b){
        return (a*b)/HCForGCD.gcd(a,b);
    }
}
