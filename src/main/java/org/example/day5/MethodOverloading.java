package org.example.day5;

import java.util.function.Function;

/**
 * @author Bibash Bogati
 * @created 2025-02-16
 */
public class MethodOverloading {
    FunctionOverLoading functionOverLoading = new FunctionOverLoading();



    private int input;

    public int square(int a, int b){
        FunctionOverLoading functionOverLoading = new FunctionOverLoading();
        functionOverLoading.square(a, b);
        return 1;
    }
    private double input2;


    public MethodOverloading(int input) {
        this.input = input;
    }

    public MethodOverloading(int input, int input2) {

    }

    public MethodOverloading(int input, int input2, int input3) {

    }
    public MethodOverloading(int input, int input2, int input3, int input4) {

    }

    public MethodOverloading() {

    }

    public MethodOverloading(double a) {
        this.input2 = a;
    }

    public double getInput2() {
        return input2;
    }

    public int getInput() {
        return input;
    }
}
