package com.ahmad;

import java.util.Scanner;

public class KK_11_Functions {
//    public static void main(String[] args) {
//        //greeting();
//
//        int ans = sum2();
//        System.out.println(ans);
//    }
//    //static void greeting(){
//      //  System.out.println("Hello World");
//    //}
//
//    static int sum2(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number 1: ");
//        int num1 = sc.nextInt();
//        System.out.print("Enter number 2: ");
//        int num2 = sc.nextInt();
//        int sum = num1 + num2;
//        return sum;
//    }

    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        String personalized = myGreet(name);
        System.out.println(personalized);
    }

    static String myGreet(String name){
        String greeting = "Hello, " + name + "!";
        return greeting;
    }

    static String greet() {
        String greeting = "Hello World!";
        return greeting;
    }
}