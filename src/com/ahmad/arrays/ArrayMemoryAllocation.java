package com.ahmad.arrays;

public class ArrayMemoryAllocation {
    public static void main(String[] args) {

        //storing 5 roll no
        //int[] rnos = new int[5];
        //or directly
        //int[] rnos2 = {23, 15, 45, 12, 19};

        int[] ros; //declaration
        ros = new int[10];//initialization
        ros[0] = 1;
        ros[1] = 2;
        ros[2] = 3;
        ros[3] = 4;
        ros[4] = 5;
        ros[5] = 6;
        ros[6] = 7;
        ros[7] = 8;
        ros[8] = 9;
        ros[9] = 10;
        System.out.println(ros[5]);

        String[] arr = new String[10];
        System.out.println(arr[5]);
    }
}
