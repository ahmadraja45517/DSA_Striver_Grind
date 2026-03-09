package com.ahmad.basics;

import java.util.Scanner;

public class KK_09_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of fruit: ");
//        String fruit = sc.nextLine();
//
//        switch (fruit) {
//            case "mango" -> System.out.println("King of fruits");
//            case "apple" -> System.out.println("A sweet red fruit");
//            case "banana" -> System.out.println("A long yellow fruit");
//            case "orange" -> System.out.println("Round fruit");
//            case "grapes" -> System.out.println("Small fruit");
//            default -> System.out.println("Please enter a valid fruit!");
//        }

        int n =  sc.nextInt();
        switch(n){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid input");
        }
    }
}
