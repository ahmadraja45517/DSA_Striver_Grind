package com.ahmad;
import java.util.Scanner;

public class KK_03_Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Comment Test
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

//        int max = a;
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }

//        int max = 0;
//        if (a > b){
//            max = a;
//        }
//        else if (b > a){
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }

        int max = Math.max(Math.max(a, b), c);
        System.out.println(max);
    }
}
