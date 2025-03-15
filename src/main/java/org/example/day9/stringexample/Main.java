package org.example.day9.stringexample;

/**
 * @author Bibash Bogati
 * @created 2025-03-14
 */
public class Main {


    public static void main(String[] args) {


        String data = "hello world";
        System.out.println(System.identityHashCode(data));

        data = data.concat(" world");
        System.out.println(System.identityHashCode(data));

        String data2 = "hello world";
        System.out.println(System.identityHashCode(data2));


        System.out.println(data);
        System.out.println(data2);
    }
}
