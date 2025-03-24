package org.example.day10.threading;

/**
 * @author Bibash Bogati
 * @created 2025-03-23
 */
public class UsingClassThread extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                System.out.println("MAX PRIORITY:   Role Creation for user " + i);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
