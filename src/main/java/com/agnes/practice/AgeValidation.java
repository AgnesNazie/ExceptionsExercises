package com.agnes.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Age checker");

        try {
            System.out.println("Enter your age");
            int age = scanner.nextInt();
            if (age <= 18)
                throw new AgeValidationChecker("You must be at least 18 years old to access");
            else {
                System.out.println("Access granted. You are " + age + " years old.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Enter an interger " + e.getMessage());
        } catch (AgeValidationChecker e) {
            System.out.println("Accessed denied " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
