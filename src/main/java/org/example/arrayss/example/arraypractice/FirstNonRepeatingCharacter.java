package org.example.arrayss.example.arraypractice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Bibash Bogati
 * @created 2025-02-13
 */
public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String s1 = "abacabad";
        String s2 = "abacabaabacaba";

        System.out.println(firstNotRepeatingCharacter(s1));  // Output: c
        System.out.println(firstNotRepeatingCharacter(s2));  // Output: _
    }


    public static char firstNotRepeatingCharacter(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            int count = map.getOrDefault(c, 0);
            map.put(c, count + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }

        }
        return '_';
    }
}
