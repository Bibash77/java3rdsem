package org.example.day8.exceptionexample;

/**
 * @author Bibash Bogati
 * @created 2025-03-10
 */
public class MainMethod {

    public static void main(String[] args) {


        try {

            Student student = new Student();
            student.setAge(400);

            student.getAge();

            int a = 10/0;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
//            System.out.println("Invalid ArithmeticException");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }


        testFunction();

    }

    private static void testFunction() {
        System.out.println("After Exception");
    }
}
