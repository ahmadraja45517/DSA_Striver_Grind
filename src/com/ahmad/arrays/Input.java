package com.ahmad.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //array of primitives
//        int[] arr = new int[5];
//        arr[0] = 23;
//        arr[1] = 45;
//        arr[2] = 63;
//        arr[3] = 13;
//        arr[4] = 33;
//        System.out.println(arr[3]);
//
//        //input using for loops
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("Enter number: ");
//            arr[i] = in.nextInt();
//        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        System.out.println(Arrays.toString(arr));

        //array pf objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            System.out.print("Enter the string:");
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        str[1] = "Ahmad";
        System.out.println(Arrays.toString(str));

    }
}
