package org.example.day2;

/**
 * @author Bibash Bogati
 * @created 2025-02-07
 */


public class DefiningConstant {

    private static float PI = 3.14f;

    public static void main(String[] args) {

        final int data1 = 4;

        // not possible
//        data1 = 3;

        System.out.println(data1);

        System.out.println(DefiningConstant.PI);

    }
}
