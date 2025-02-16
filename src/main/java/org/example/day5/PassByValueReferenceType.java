package org.example.day5;

/**
 * @author Bibash Bogati
 * @created 2025-02-16
 */
public class PassByValueReferenceType {

    public static void main(String[] args) {
        TestEntity testEntity = new TestEntity();
        testEntity.setInput("Hello World");

        modifyObject(testEntity);

        System.out.println(testEntity.getInput());
    }

    private static void modifyObject(TestEntity testEntity) {
        System.out.println(testEntity);
        testEntity.setInput("Hello World in another world");
    }
}
