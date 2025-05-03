package com.agnes.practice;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class NameManager {
    public static void main(String[] args) {
        exe8();
    }

    private List<String> name;

    //constructor
    public NameManager() {
        name = new ArrayList<>();
    }

    //method to find name
    public void foundName(String names) throws NameNotFoundExceptions {
        if (!name.contains(names)) {
            throw new NameNotFoundExceptions("Error: Name '" + names + "' not found in the list.");

        }
        System.out.println("Name found: " + names);

    }

    //method to find duplicate name
    public void addName(String names) throws DuplicateNameExceptions {
        if (name.contains(names)) {
            throw new DuplicateNameExceptions("Error: Name '" + names + "' already exists in the list.");

        }
        name.add(names);
        System.out.println("Name added " + names);
    }

    //test
    public static void exe7() {
        NameManager nameManager = new NameManager();
        try {
            nameManager.addName("Agnes");
            nameManager.addName("Nazie");
            nameManager.addName("Mehrdad");
            nameManager.addName("Agnes");
        } catch (DuplicateNameExceptions e) {
            System.out.println(e.getMessage());
        }
        try {
            nameManager.foundName("che");
        } catch (NameNotFoundExceptions e) {
            System.out.println(e.getMessage());
        }
    }

    public static void exe8() {
        Path path = Paths.get("sample.txt");
        String text = "Hello, this text is written using try-with-resources in Java!";
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write(text);
            System.out.println("Text written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());

        }
    }

}
