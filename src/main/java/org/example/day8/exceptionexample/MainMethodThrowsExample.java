package org.example.day8.exceptionexample;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author Bibash Bogati
 * @created 2025-03-10
 */
public class MainMethodThrowsExample {

    public static void main(String[] args) {

       try {
           System.out.println("Opening Database connection...");
           openFile(null);
       } catch (NullPointerException e) {
           System.out.println("Running some intermediate code...");
           System.out.println("saving something on database...");
           throw new NullPointerException("File not found");
       } finally {
           System.out.println("Closing Database connection...");
       }
    }

    private static void openFile(String test) throws NullPointerException {
        test.length();

    }
}
