package org.example.day10.threading.syncrhonizedeg;

/**
 * @author Bibash Bogati
 * @created 2025-03-23
 */
public class AnsyncMain {

    public static void main(String[] args) {
        CounterVariable counter = new CounterVariable();

        MyThread thread1 = new MyThread(counter);
        MyThread thread2 = new MyThread(counter);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // The count will be 2000 as synchronization is applied only to the critical section
        System.out.println("Data Downloaded " + counter.getCount() + "%");
    }
}
