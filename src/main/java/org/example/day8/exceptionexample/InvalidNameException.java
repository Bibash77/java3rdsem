package org.example.day8.exceptionexample;

/**
 * @author Bibash Bogati
 * @created 2025-03-10
 */
public class InvalidNameException extends RuntimeException {


    public InvalidNameException(String message) {
        super(message);
    }
}
