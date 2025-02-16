package org.example.day5;

/**
 * @author Bibash Bogati
 * @created 2025-02-16
 */


public class PassByValueExample {

    public static void main(String[] args) {
        int a = 100;
        modifyObject(a);
        System.out.println(a);
    }

    private static void modifyObject(int a) {
        a = 500;
    }


}
