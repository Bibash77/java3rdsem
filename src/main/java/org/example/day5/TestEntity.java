package org.example.day5;

/**
 * @author Bibash Bogati
 * @created 2025-02-16
 */
public class TestEntity {
    public static double PI = 3.14159265358979323846;;

    private String input;
    private double uuid;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public double getPi() {
        return PI;
    }


    public static void printPI() {
        System.out.println(PI);
    }

    public static void sum(int a, int b) {

        System.out.println(a + b);
    }

    public TestEntity() {

    }

    public TestEntity(TestEntity testEntity) {
        this.input = testEntity.getInput();
        this.uuid = Math.random();
    }
}
