package org.example.day2;

import java.util.Scanner;

/**
 * @author Bibash Bogati
 * @created 2025-02-06
 */
public class MultiInputInteger {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value 1");
        int intValue = scanner.nextInt();

        int intValue2 = scanner.nextInt();
        System.out.println(intValue2);


        int sum = intValue + intValue2;

        System.out.println(sum);
    }
}
