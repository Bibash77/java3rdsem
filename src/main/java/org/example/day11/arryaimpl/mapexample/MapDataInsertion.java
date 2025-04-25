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
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("C", 7);
        map.put("D", 4);


        map.remove("B");


        if(map.get("B") == 2){
            System.out.println("Yes B key is 2");
        }


        for (Map.Entry<String, Integer> individualValue : map.entrySet()) {
            System.out.println(individualValue.getKey() + " : " + individualValue.getValue());
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
