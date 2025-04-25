package org.example.day11.arryaimpl.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Bibash Bogati
 * @created 2025-04-21
 */
public class ExampleOne {

    public static void main(String[] args) {

        // if frequently manipulation
        List<Integer> linkedList  = new LinkedList<>();

        // if frequently traverse
        List<Integer> arrayList  = new ArrayList<>();


        for (int i = 0; i < 100000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }


        long start = System.currentTimeMillis();
        System.out.println(linkedList.get(700));
        long end = System.currentTimeMillis();

        System.out.println("Calculating time");
        System.out.println(end - start);



        start = System.currentTimeMillis();
        System.out.println(arrayList.get(700));

        end = System.currentTimeMillis();

        System.out.println("Calculating time");

        System.out.println(end - start);
    }
}
