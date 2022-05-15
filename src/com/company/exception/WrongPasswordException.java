package com.company.exception;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        System.out.println("WrongPasswordException");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
