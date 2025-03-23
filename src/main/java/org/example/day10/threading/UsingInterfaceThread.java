package org.example.day10.threading;

/**
 * @author Bibash Bogati
 * @created 2025-03-23
 */
public class UsingInterfaceThread implements Runnable {


    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                System.out.println("Processing email for user " + i);
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }


}
