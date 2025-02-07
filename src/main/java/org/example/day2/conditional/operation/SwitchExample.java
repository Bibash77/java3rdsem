package org.example.day2.conditional.operation;

import java.util.Scanner;

/**
 * @author Bibash Bogati
 * @created 2025-02-07
 */
public class SwitchExample {

    public static void main(String[] args) {

        // take input from user

        // put in varaible a


        // if variable is 1 then print given value is 1
        // else if given value  is 2  then print given value is 2
        // else print invalid value


        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        String value = scanner.nextLine();

//a, b,c,d,e
        switch (a) {
            case 1:
                System.out.println("Given value is 1");
                break;
            case 2:
                System.out.println("Given value is 2");
                break;
            default:
                System.out.println("Invalid Value");
        }

    }
}
