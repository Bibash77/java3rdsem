package org.example.day11.arryaimpl.setexample;

import java.util.*;

/**
 * @author Bibash Bogati
 * @created 2025-04-25
 */
public class NonDuplicateElementWithSet {


    public static void main(String[] args) {
        Set<String> values = new HashSet<>(); // ordering not guaranteed
//        Set<String> values = new TreeSet<>(); maintains natural ordering
//        Set<String> values = new LinkedHashSet<>(); // insertion order

        values.add("ball");
        values.add("apple");
        values.add("cat");
        values.add("zebra");
        values.add("test");
        values.add("user");
        values.add("val");
        values.add("el");
        values.add("asc");



        values.remove("ball");



       Iterator<String> iterator =  values.iterator();

       while(iterator.hasNext()){

           String data = iterator.next();
                   if(data.equals("ball")){
                       System.out.println("Lau ball ayexa");
                   }
           System.out.println(data);
       }






    }
}
