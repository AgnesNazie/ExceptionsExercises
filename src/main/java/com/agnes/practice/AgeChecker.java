package com.agnes.practice;

import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Age checker");

        try {
            System.out.println("Enter your age");
            int age = scanner.nextInt();
            if (age <= 0)
                throw new IllegalArgumentException(" Age cannot be negative.  Enter your age");
            System.out.println("You are " + age + " years old");

        } catch (InputMismatchException e) {
            System.out.println("Error: Enter an interger " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
