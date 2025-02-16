package org.example.day5;

/**
 * @author Bibash Bogati
 * @created 2025-02-16
 */


public class FunctionOverLoading {

    public void square(int a){
        System.out.println("Called int passed method:  square(int a)");
        System.out.println(a*a);
    }

    public void square(double a){
        System.out.println("Called square(double a)");

        System.out.println(a*a);
    }

    public void square(int a, int b){
        System.out.println("Called square(int a, int b)");

        System.out.println(a*b);
    }

    public void square(int a, double b){
        System.out.println("Called for int and double param:    square(int a, double b)");

        System.out.println(a*b);
    }


}
