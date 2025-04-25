package org.example.day11.arryaimpl;

import java.util.*;

/**
 * @author Bibash Bogati
 * @created 2025-04-20
 */
public class GetList {

    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        data.add("Apple"); //0
        data.add("Ball"); //1
        data.add("Cat"); //2

        String returnedData = data.get(1);
        System.out.println(returnedData);
    }
}
