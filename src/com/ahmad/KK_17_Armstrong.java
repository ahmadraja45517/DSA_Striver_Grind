package com.ahmad;

import java.util.Scanner;

public class KK_17_Armstrong {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the value of n: ");
//        int n = in.nextInt();

        for (int i = 100; i <= 1000; i++) {
            if (armstrong(i)){
                System.out.println(i + " is an Armstrong number");
            }
        }
    }

    static boolean armstrong(int a){
        int sum = 0;
        int original = a;
        while(a > 0){
            int rem = a % 10;
            int cube = rem * rem * rem;
            a = a / 10;
            sum = sum + cube;
        }
        if (sum == original){
            return true;
        }
        return false;
    }
}
