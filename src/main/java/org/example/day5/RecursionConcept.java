package org.example.day5;

/**
 * @author Bibash Bogati
 * @created 2025-02-16
 */
public class RecursionConcept {


    public static void main(String[] args) {
        RecursionConcept r = new RecursionConcept();
        System.out.println( r.sum(10));

    }



    private int sum(int i) {
        if(i==1) {
            return 1;
        }
        return i + sum(i - 1);
    }
}
