package org.example.day2;

import java.util.*;

/**
 * @author Bibash Bogati
 * @created 2025-02-06
 */
public class MultiInputFloat {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value 1");
        float value1 = scanner.nextFloat();

        System.out.println("Enter value 2");
        float value2 = scanner.nextFloat();


        float sum = value2 + value1;

        System.out.println(sum);
    }
}
