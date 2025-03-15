package org.example.day9.stringexample;

/**
 * @author Bibash Bogati
 * @created 2025-03-14
 */
public class StringConversion {

    public static void main(String[] args) {

        Integer data = 1;

        String dataString = String.valueOf(data);
        dataString = dataString.concat("1");
        System.out.println(dataString);
        Integer newInt = Integer.parseInt(dataString);
        newInt = newInt + 1;

        System.out.println(newInt);
        dataString = dataString.concat("a");

        System.out.println(Integer.valueOf(dataString));

    }
}
