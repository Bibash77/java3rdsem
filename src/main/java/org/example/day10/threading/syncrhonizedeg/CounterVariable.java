package org.example.day10.threading.syncrhonizedeg;

/**
 * @author Bibash Bogati
 * @created 2025-03-23
 */
public class CounterVariable {
    private int count = 0;

    public void increment() {
        count++;
    }

    public synchronized void incrementSynchronized() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
