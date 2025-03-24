package org.example.day10.threading;

/**
 * @author Bibash Bogati
 * @created 2025-03-24
 */
public class ThreadPriorityExample {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("User Registration has been started");
        long startTime = System.currentTimeMillis();

//        ---------------------------------------->>>>>>>

        // processing email
        Thread thread = new Thread(new UsingInterfaceThread());
        thread.setPriority(Thread.MIN_PRIORITY);


//        ---------------------------------------->>>>>>>
        // processing roles
        Thread thread2 = new UsingClassThread();
        thread2.setPriority(Thread.MAX_PRIORITY);

        Thread thread3 = new Thread(new UsingInterfaceThread());
        thread.setPriority(Thread.MIN_PRIORITY);

        Thread thread4 = new Thread(new UsingInterfaceThread());
        thread.setPriority(Thread.MIN_PRIORITY);

        thread2.start();
        thread.start();
        thread3.start();
        thread4.start();


        // waiting the main thread
        thread.join();
        thread2.join();
        thread3.join();
        thread4.join();

        long endTime = System.currentTimeMillis();

        System.out.println("Successfully completed API on time: " + (endTime - startTime));
    }
}
