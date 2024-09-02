package com.tejas;
import java.util.Scanner;
// Switch case inside a switch case is called as Nested Switch Case
public class NestedSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String department = sc.next();
// Conventional Method:
        switch (empID){
            case 1:
                System.out.println("Employee Id is: 1");
                break;
            case 2:
                System.out.println("Employee Id is: 2");
                break;
            case 3:
                System.out.println("Employee Id is: 3");
                switch (department){
                    case "Computer":
                        System.out.println("Department is Computer");
                        break;
                    case "IT":
                        System.out.println("Department is IT");
                        break;
                    case "Mechanical":
                        System.out.println("Department is Mechanical");
                        break;
                    default:
                        System.out.println("Department is Invalid");
                        break;
                }
                break;
            case 4:
                System.out.println("Employee Id is: 4");
                switch (department){
                    case "Computer":
                        System.out.println("Department is Computer");
                        break;
                    case "IT":
                        System.out.println("Department is IT");
                        break;
                    case "Mechanical":
                        System.out.println("Department is Mechanical");
                        break;
                    default:
                        System.out.println("Department is Invalid");
                        break;
                }
                break;
            case 5:
                System.out.println("Employee Id is: 5");
                break;
            default:
                System.out.println(empID + " Employee Id is incorrect");
                break;
        }
// Enhanced Switch Case Method:
        switch (empID) {
            case 1 -> System.out.println("Employee Id is: 1");
            case 2 -> System.out.println("Employee Id is: 2");
            case 3 -> {
                System.out.println("Employee Id is: 3");
                switch (department) {
                    case "Computer" -> System.out.println("Department is Computer");
                    case "IT" -> System.out.println("Department is IT");
                    case "Mechanical" -> System.out.println("Department is Mechanical");
                    default -> System.out.println("Department is Invalid");
                }
            }
            case 4 -> {
                System.out.println("Employee Id is: 4");
                switch (department) {
                    case "Computer" -> System.out.println("Department is Computer");
                    case "IT" -> System.out.println("Department is IT");
                    case "Mechanical" -> System.out.println("Department is Mechanical");
                    default -> System.out.println("Department is Invalid");
                }
            }
            case 5 -> System.out.println("Employee Id is: 5");
            default -> System.out.println(empID + " Employee Id is incorrect");
        }

    }
}
