package com.agnes.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        exe2();
    }
    public static void exe1(){
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

    public static void exe2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 100");

        int num = 0;
        try {
            num = scanner.nextInt();
            if (num < 1 || num > 100) {
                System.out.println("Range is out of bounds please enter number between 1 to 100");
            } else {
                System.out.println(num);
            }

        } catch (InputMismatchException e) {
            System.out.println("Number is out of bounds " + e.getMessage());
        }
    }
}
