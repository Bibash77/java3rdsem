package org.example.day3.userdefinedfunction;

import java.util.Scanner;

/**
 * @author Bibash Bogati
 * @created 2025-02-09
 */
public class EnumImplExample {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayString = scanner.nextLine();

        Day day = Day.valueOf(dayString);
        switch (day) {
            case SUNDAY:
                System.out.println("Sunday");
                break;
            case MONDAY:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

    }
}
