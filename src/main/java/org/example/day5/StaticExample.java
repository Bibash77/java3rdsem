package org.example.day5;

/**
 * @author Bibash Bogati
 * @created 2025-02-16
 */
public class StaticExample {


    public static void main(String[] args) {
        TestEntity testEntityVar = new TestEntity();

        // when we dont use static keyword
        testEntityVar.setInput("Ram");

        System.out.println(testEntityVar.getInput());

        System.out.println(testEntityVar.PI);

        TestEntity testEntity1Var = new TestEntity();
        testEntity1Var.setInput("Hari");

// when we use static keyword
        TestEntity.printPI();
        double piValue = TestEntity.PI;


        TestEntity.sum(1, 2);


        // lets copy instance
        TestEntity testEntity2Var = new TestEntity(testEntity1Var);
        System.out.println("------------------ \n new copied name: "  + testEntity2Var.getInput());




    }
}
