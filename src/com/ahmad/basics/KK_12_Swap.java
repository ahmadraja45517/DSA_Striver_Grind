package com.ahmad.basics;

import java.util.Scanner;

public class KK_12_Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println("Enter the number");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}
