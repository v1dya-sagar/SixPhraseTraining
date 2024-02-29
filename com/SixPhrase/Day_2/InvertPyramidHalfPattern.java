package com.SixPhrase.Day_2;

public class InvertPyramidHalfPattern {
//    1 2 3 4 17 18 19 20
//      5 6 7 14 15 16
//        8 9 12 13
//         10 11
//    1 2 3 4
//      5 6 7
//        8 9
//          10
        public static void main(String[] args) {
            int n = 4;
            int c = 1;
            for (int i = 1; i <= n ; i++) {
                for(int j = 1 ; j < i; j++){
                    System.out.print("  ");
                }

                for(int k = n ; k >= i; k--) {
                    System.out.print(c + " ");
                    c++;
                }
                System.out.println();
            }
        }
}
