package com.agnes.practice;

import java.util.ArrayList;
import java.util.List;

public class NameManager {
    public static void main(String[] args) {
        exe7();
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
    public static void exe7(){
        NameManager nameManager = new NameManager();
        try {
            nameManager.addName("Agnes");
            nameManager.addName("Nazie");
            nameManager.addName("Mehrdad");
            nameManager.addName("Agnes");
        } catch (DuplicateNameExceptions e){
            System.out.println(e.getMessage());
        }
        try {
            nameManager.foundName("che");
        } catch (NameNotFoundExceptions e) {
            System.out.println(e.getMessage());
        }
    }

}
