package com.SixPhrase.Day_5;

import java.util.Scanner;

public class ThreeFourSeriesNthTerm {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, ans = 0;
        int power = 1;

        while(sum < n) {
            sum += (int)Math.pow(2,  power);
            power++;
        }

        int counter_val = (int)Math.pow(2, --power);
        sum -= counter_val;

        while(counter_val != 1) {
            int temp_sum = sum + (counter_val / 2);
            if(n <= temp_sum) {
                ans = ans * 10 + 3;
            }else {
                ans = ans * 10 + 4;
                sum = temp_sum;
            }

            counter_val /= 2;
        }

        System.out.println(ans);

    }

}
