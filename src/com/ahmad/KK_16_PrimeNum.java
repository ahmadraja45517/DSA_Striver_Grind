package com.ahmad;
import java.util.Scanner;

public class KK_16_PrimeNum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        System.out.println(isPrime(n));
    }

    static boolean isPrime(int a) {
        for(int i = 2; i < a; i++){
            if (a % i == 0){
                return false;
            }
        }
        return true;
    }
}
