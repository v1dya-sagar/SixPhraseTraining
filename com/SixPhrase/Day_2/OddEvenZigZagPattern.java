package com.SixPhrase.Day_2;

import java.util.Scanner;

public class OddEvenZigZagPattern {
//            1                 odd
//            2 3               even
//            6 5 4             odd
//            7 8 9 10          even
//            15 14 13 12 11    odd
//            16 17 18 19 20 21 even
public static void main(String[] args) {

    int num = 7;
    int c = 0;
    for(int i = 1;i<=num;i++){
        if( i % 2 == 1){
            int val = c + i;
            int val2 = c;
            for(int j = val;j>val2;j--){
                System.out.print(j + " ");
                ++c;
            }
        }
        else{
            for(int k = 1;k<=i;k++){
                System.out.print( ++c + " ");
            }
        }
        System.out.println();
    }
}
}
