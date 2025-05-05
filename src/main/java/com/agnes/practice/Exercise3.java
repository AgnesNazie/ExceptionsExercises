package com.agnes.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercise3 {
    public static void main(String[] args) {
        Path path = Paths.get("Number.txt");
        try {
            BufferedReader reader = Files.newBufferedReader(path);
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    // Inner try block: Handles parsing
                    int number = Integer.parseInt(line);
                    System.out.println("Number: " + number);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number: " + line);
                }
            }

        } catch (NoSuchFileException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}

