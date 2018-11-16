package com.example.spring.file;


public class SelfException extends Exception {
    public SelfException() {
    }

    public SelfException(String message) {
        super(message);
    }
}
