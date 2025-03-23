package org.example.day10.threading;

/**
 * @author Bibash Bogati
 * @created 2025-03-23
 */
public class WithOutThreadExample {

    public static void main(String[] args) {
        System.out.println("User Registration has been started");
        long startTime = System.currentTimeMillis();

        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                System.out.println("Processing email for user " + i);
            }

            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                System.out.println("Role Creation for user " + i);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Successfully completed API on time: " + (endTime - startTime));
    }
}
