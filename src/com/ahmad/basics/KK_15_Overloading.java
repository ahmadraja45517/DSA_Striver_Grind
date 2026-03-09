package com.ahmad.basics;

import java.util.Arrays;

public class KK_15_Overloading {
    public static void main(String[] args) {
        fun(67);
        fun("Ahmad Raja");
        demo("Ahmad", "Amit", "Ankit");
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}
