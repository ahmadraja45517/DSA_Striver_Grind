package com.ahmad.arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 9, 16, 25, 36};
        System.out.println(max(arr, 1, 3));
    }
    static int max(int[] arr, int start, int end){
//        int max = arr[0];
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
//        return max;
        int max = arr[start];
        for (int i = start; i <= end; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
