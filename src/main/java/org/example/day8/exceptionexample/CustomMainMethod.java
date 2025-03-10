package org.example.day8.exceptionexample;

import java.util.Scanner;

/**
 * @author Bibash Bogati
 * @created 2025-03-10
 */
public class CustomMainMethod {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        // if name length cai greater than 10
        if(name.length() > 2){
            throw new InvalidNameException("Name must be less than 10 characters");
        }

        // throw error message to frontend

        // else save in database


    }
}

