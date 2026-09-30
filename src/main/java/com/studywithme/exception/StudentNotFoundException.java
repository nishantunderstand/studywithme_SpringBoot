package com.studywithme.exception;

/**
 * How would you determine, whether it is going to be checked or unchecked  ?
 */

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message) {
        super(message);
    }
}