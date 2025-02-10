package org.example.arrayss.example;

import java.util.Arrays;

/**
 * @author Bibash Bogati
 * @created 2025-02-09
 */


public class FindMinElement {

    public static void main(String[] args) {

        int[] arr = { 5, 6, 7, 8, 9, 1, 2, 3, 4 };
//        Arrays.sort(arr);

        System.out.println(Arrays.stream(arr).min().getAsInt());
        Arrays.stream(arr).forEach(System.out::println);

    }
}
