package com.ahmad;
import java.util.Scanner;

public class KK_04_CaseCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch = s.next().trim().charAt(0);

        if  (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        } else{
            System.out.println("Uppercase");
        }
    }
}
