package interview_preaparation;

import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        int a, b;
        int result = 0;
        String operator;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        a = sc.nextInt();

        System.out.println("Enter the second number:");
        b = sc.nextInt();

        System.out.println("Enter your choice (+, -, *, /):");
        operator = sc.next();  // Reading the operator as a String

        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator entered. Please choose +, -, *, or /.");
                return;
        }

        System.out.println("The result is: " + result);
        sc.close();
    }
}