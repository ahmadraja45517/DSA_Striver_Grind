package com.ahmad.arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);
//        list.add(9);
//        list.add(10);
//
//        System.out.println(list);
//
//        list.set(0,99);
//        System.out.println(list);
//
//        list.remove(0);
//        System.out.println(list);
//
//        System.out.println(list.contains(11));

        for (int i = 0; i < 5; i++){
            list.add(in.nextInt());
        }

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.print(list);
    }
}
