package com.ahmad;
import java.util.Scanner;

public class KK_02_Loops {
    public static void main(String[] args) {

        //for loop
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter the value of n :");
//        int n = in.nextInt();
//
//        for (int num = 1; num <= n; num++) {
//            System.out.println(num + " ");
//        }

        //while loops
        /*
        Syntax:
        while (condition){
           //body}
         */

        int num = 1;
        while (num <= 10) {
            System.out.println(num);
            num += 1;
        }

        //do while loops
        /*

           do {

           } while (condition);
         */

        int n = 1;
        do {
            System.out.println("Hello World");
        } while (n != 1);
    }
}

