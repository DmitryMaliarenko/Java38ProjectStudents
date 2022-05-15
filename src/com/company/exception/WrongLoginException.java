package com.company.exception;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
        System.out.println("WrongLoginException");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
