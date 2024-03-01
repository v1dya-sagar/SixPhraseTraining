package com.SixPhrase.Day_3;

public class LuckiestPersonOnGunPoint {
    public static void main(String[] args) {
        int n = sc.nextInt();
        int count = 0;
        while(Math.pow(2,count)<=n){
            count++;
        }
        if(Math.pow(2,count)== n){
            //powers of 2 has always 1 as answer
            System.out.println("Answer: " + 1);
            return;
        }
        else{
            int value = (int)Math.pow(2,c-1);
            int Answer = 1;
            while(value<n){
                Answer+=2;
                value++;
            }
            System.out.println("Answer:" + Answer);
    }
}
