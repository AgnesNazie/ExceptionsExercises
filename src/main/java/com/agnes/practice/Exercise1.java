package com.agnes.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        try {
            // Test the method with a valid email
            String validEmail = "user@example.com";
            validateEmail(validEmail);  // This will pass

            // Test the method with an invalid email
            String invalidEmail = "userexample.com";  // Missing '@' and '.'
            validateEmail(invalidEmail);  // This will throw an exception
        } catch (IllegalArgumentException e) {
            // Catch the thrown exception and print the error message
            System.out.println(e.getMessage());
        }

    }

    public static void exe1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my program");
        try {
            System.out.println("Enter a number ");
            int number1 = scanner.nextInt();
            System.out.println("Enter number 2");

            int number2 = scanner.nextInt();
            int result = 0;

            result = number1 / number2;
            System.out.println("Result" + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by Zero");
        } finally {
            scanner.close();
        }
    }

    public static void exe2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 100");
        try {
            int num = 0;

            num = scanner.nextInt();
            if (num < 1 || num > 100) {
                System.out.println("Range is out of bounds please enter number between 1 to 100");
            } else {
                System.out.println(num);
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input . please enter and integer");
        } finally {
            scanner.close();
        }
    }

    public static void exe4() {
        Path path = Paths.get("Numbers.txt");
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                try {
                    int number = Integer.parseInt(line.trim()); // Try parsing each line
                    System.out.println("Parsed number: " + number);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format in line: \"" + line + "\"");
                }
            }
        } catch (NoSuchFileException e) {
            System.out.println("File not found: " + e.getFile());
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }

    public static void exe5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my program");
        try {
            System.out.println("Enter a number");
            int number1 = scanner.nextInt();
            System.out.println("Enter number2");

            int number2 = scanner.nextInt();
            int result = 0;

            result = number1 / number2;
            System.out.println("Result" + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by Zero");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers.");
        } finally {
            System.out.println("Execution complete. Thank you for using the program.");
        }
    }


    public static void validateEmail(String email) {
        // Basic validation for email format (must contain '@' and '.')
        if (email == null || !email.contains("@") || !email.contains(".")) {
            // If email is invalid, throw an IllegalArgumentException
            throw new IllegalArgumentException("Invalid email format. Email must contain '@' and '.'");
        } else {
            // If email is valid, print confirmation
            System.out.println("Valid email: " + email);

        }
    }

}
