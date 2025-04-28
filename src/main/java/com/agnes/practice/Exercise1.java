package com.agnes.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my program");
        System.out.println("Enter a number");
        int number1 = scanner.nextInt();
        System.out.println("Enter number2");
        int number2 = scanner.nextInt();
        int result = 0;

        try {
            result = number1 / number2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Invalid division" + e.getMessage());
        }
    }
}
