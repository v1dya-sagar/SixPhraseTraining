package com.SixPhrase.Day_2;

public class XPattern {
    public static void main(String[] args) {
//            0 1 2 3 4 5 6
    //        *           *0
    //          *       *  1
    //            *   *    2
    //              *      3
    //            *   *    4
    //          *       *  5
    //        *           *6
        int n = 7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // Print characters at corresponding
                // places satisfying the two conditions
                if ((i == j) || (i + j == n - 1))
                    System.out.print("*");

                    // Print blank space at rest of places
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
