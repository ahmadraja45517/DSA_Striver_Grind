package com.ahmad;
import java.util.Scanner;

public class KK_08_Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans = 0;
        while(true){
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                //input two numbers
                System.out.print("Enter the value of a: ");
                int a = in.nextInt();

                System.out.print("Enter the value of b: ");
                int b = in.nextInt();

                if (op == '+'){
                    ans = a + b;
                }
                else if (op == '-'){
                    ans = a - b;
                }
                else if (op == '*'){
                    ans = a * b;
                }
                else if (op == '/'){
                    if(b != 0){
                        ans = a / b;
                    }
                }
                else if (op == '%'){
                    ans = a % b;
                }
            }
            else if (op == 'x' || op == 'X'){
                break;
            }
            else{
                System.out.println("Invalid input");
            }
            System.out.println("The result of operation is "+ans);
            break;
        }
    }
}
