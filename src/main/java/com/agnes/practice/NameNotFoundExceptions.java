package com.agnes.practice;

public class NameNotFoundExceptions extends RuntimeException {
    public NameNotFoundExceptions(String message) {
        super(message);
    }
}

class DuplicateNameExceptions extends RuntimeException {
    public DuplicateNameExceptions(String message) {
        super(message);

    }
}
