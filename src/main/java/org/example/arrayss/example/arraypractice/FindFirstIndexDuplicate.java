package org.example.arrayss.example.arraypractice;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Bibash Bogati
 * @created 2025-02-13
 */
public class FindFirstIndexDuplicate {

    public static void main(String[] args) {
        int[] array = {1,5,2, 3, 5, 3, 1, 5, 2};
        System.out.println(firstDuplicate(array));
    }

    private static int firstDuplicate(int[] array) {

        HashSet<Integer> map = new HashSet<>();

        for (int i : array) {
            if(map.contains(array[i])) {
                return array[i];
            }
            map.add(array[i]);
        }
        return 0;
    }


}
