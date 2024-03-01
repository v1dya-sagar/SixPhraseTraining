package com.SixPhrase.Day_3;

import java.util.Scanner;

public class OddFirstEvenSecond {
    // i/p : 7625413
    // o/p : 7513624
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int oddSection = 0, evenSection = 0, oddPlace = 1, evenPlace = 1;

        while (n > 0){

            int rem = n%10;
            if(rem % 2 != 0){
                oddSection += rem * oddPlace;
                oddPlace *= 10;
            } else {
                evenSection += rem * evenPlace;
                evenPlace *= 10;
            }

            n /= 10;
        }
        System.out.println(oddSection*evenPlace + evenSection);
    }
}
