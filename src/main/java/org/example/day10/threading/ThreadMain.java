package org.example.day10.threading;

/**
 * @author Bibash Bogati
 * @created 2025-03-23
 */
public class ThreadMain {

    public static void main(String[] args) {

        System.out.println("User Registration has been started");
        long startTime = System.currentTimeMillis();

//        ---------------------------------------->>>>>>>

        // processing email
        Thread thread = new Thread(new UsingInterfaceThread());
        thread.start();

//        ---------------------------------------->>>>>>>
        // processing roles
        Thread thread2 = new UsingClassThread();
        thread2.start();

        long endTime = System.currentTimeMillis();

        System.out.println("Successfully completed API on time: " + (endTime - startTime));
    }
}
