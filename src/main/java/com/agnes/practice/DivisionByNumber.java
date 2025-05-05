package com.agnes.practice;

import java.util.Scanner;

public class DivisionByNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("welcome to my division program");

            System.out.println("Enter a number");
            int number = scanner.nextInt();
            System.out.println("Enter number 2");
            int number2 = scanner.nextInt();
            int result = number / number2;
            System.out.println("Result " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error. division by zero is not possible");
        }
        scanner.close();
    }
}
