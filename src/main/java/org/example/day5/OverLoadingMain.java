package org.example.day5;

import java.util.Scanner;

/**
 * @author Bibash Bogati
 * @created 2025-02-16
 */
public class OverLoadingMain {

    public static void main(String[] args) {

        System.out.println("Enter an integer");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();


        System.out.println("Enter a double value");
        double input2 = scanner.nextDouble();

        MethodOverloading integerObject = new MethodOverloading(input);
        System.out.println(integerObject.getInput());


        MethodOverloading doubleObject = new MethodOverloading(input2);
        System.out.println(doubleObject.getInput2());



        // -----------------starting function overloading ---------------------

        System.out.println("-----------------------------------------------------------");
        // classname varible = new classname()

        FunctionOverLoading functionOverLoading = new FunctionOverLoading();
        // input is integer

        // if integer
//        call integermethod printing
//
//                if double
                // call double print

        functionOverLoading.square(input);
        // input2 is double
        functionOverLoading.square(input2);
        functionOverLoading.square(input, input2);

    }



}
