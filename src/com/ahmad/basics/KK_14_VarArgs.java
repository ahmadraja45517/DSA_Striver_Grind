package com.ahmad.basics;

import java.util.Arrays;

public class KK_14_VarArgs {
    public static void main(String[] args) {
        fun(1, 2, 3, 4, 5);

        multiple(2, 3, "Ahmad", "Amit", "Harshit");
    }

    static void multiple(int a, int b, String ...v) {
        System.out.println("a: " + a + ", b: " + b + ", v: " + Arrays.toString(v));
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
