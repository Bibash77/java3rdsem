package org.example.day11.arryaimpl.mapexample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Bibash Bogati
 * @created 2025-04-25
 */
public class MapDataInsertion {


    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();
        // add element to map
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("C", 7);
        map.put("D", 4);

// remove element
        map.remove("B");

// get element and compare
        if(map.get("B") == 2){
            System.out.println("Yes B key is 2");
        }

// loop based on key and value
        for (Map.Entry<String, Integer> individualValue : map.entrySet()) {
            System.out.println(individualValue.getKey() + " : " + individualValue.getValue());
        }
// loop key and get value from map
        for (String key : map.keySet()) {  // map.values()
            System.out.println(map.get(key));
        }

//        Set<Map.Entry<String, Integer>> keySet = map.entrySet();
//        for (Map.Entry<String, Integer> stringIntegerEntry : keySet) {
//
//        }

//        System.out.println(map.get("C"));


//        key , value





        // loop
        // value add
        // value compare
        // manipulate

        // add list of students . and display data in loop / display in specific index
    }
}
