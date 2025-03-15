package org.example.day9.stringexample;

/**
 * @author Bibash Bogati
 * @created 2025-03-14
 */
public class Main2 {

    public static void main(String[] args) {

        // this must be mutable for better performence
        String data = "";

        for (int i = 0; i < 10; i++) {
            data = data + i;
            System.out.println(System.identityHashCode(data));
        }
    }
}
