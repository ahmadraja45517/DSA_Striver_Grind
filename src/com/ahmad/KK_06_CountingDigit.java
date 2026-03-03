package com.ahmad;

import java.util.Scanner;

public class KK_06_CountingDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        long n = sc.nextLong();
        int count = 0;

        while(n > 0){
            long rem = n % 10;
            if(rem == 7){
                count++;
            }
            n = n / 10;
        }
        System.out.println("Occurence of 3 is " + count + " times.");
    }
}
