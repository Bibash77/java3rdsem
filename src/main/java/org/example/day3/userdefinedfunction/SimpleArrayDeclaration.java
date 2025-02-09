package org.example.day3.userdefinedfunction;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Bibash Bogati
 * @created 2025-02-09
 */
public class SimpleArrayDeclaration {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int [] newArr = new int[5];
        newArr[0] = 1;
        newArr[1] = 2;
        newArr[2] = 3;
        newArr[3] = 4;
        newArr[4] = 5;

        System.out.println(arr.length);
        System.out.println(arr[3]);

        for (int i = 0; i < arr.length; i++) {

            // skip if the value is 3
            if(arr[i] == 3){
                continue;
            }

            // divisible by 2 refers to odd number
            if(arr[i] % 2 == 0) {
                System.out.println(arr[i]+"is even");
            } else {
                System.out.println(arr[i]+"is odd");
            }

        }
    }
}
