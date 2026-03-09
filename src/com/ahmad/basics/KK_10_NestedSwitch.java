package com.ahmad.basics;

import java.util.Scanner;

public class KK_10_NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int empID = sc.nextInt();
//        String department = sc.next();

//        switch (empID) {
//            case 1:
//                System.out.println("Ahmad Raja");
//                break;
//            case 2:
//                System.out.println("Harshit Khanna");
//                break;
//            case 3:
//                System.out.println("Sharma");
//                switch (department) {
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "Management":
//                        System.out.println("Management Department");
//                        break;
//                    default:
//                        System.out.println("Department Not Available");
//                }
//            default:
//                System.out.println("Enter correct EmpID");
//        }

                System.out.print("Enter Employee ID: ");
                int empID = sc.nextInt();

                System.out.print("Enter Department: ");
                String department = sc.next();

                // Fully converted to Enhanced Switch syntax
                switch (empID) {
                    case 1 -> System.out.println("Ahmad Raja");
                    case 2 -> System.out.println("Harshit Khanna");
                    case 3 -> {
                        System.out.println("Emp number 3");
                        // Nested Enhanced Switch
                        switch (department) {
                            case "IT" -> System.out.println("IT Department");
                            case "Management" -> System.out.println("Management Department");
                            default -> System.out.println("Department Not Available");
                        }
                    }
                    default -> System.out.println("Enter correct EmpID");
                }
            }
        }
