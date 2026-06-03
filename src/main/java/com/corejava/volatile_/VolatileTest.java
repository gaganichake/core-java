package com.corejava.volatile_;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * What is a Volatile Field?
 *
 * Visibility: Volatile variables use main memory. A volatile field ensures that any thread reading it will see
 * the most recent write made by any other thread.
 *
 * No Atomicity: While volatile fields provide visibility, they do not guarantee atomicity for compound
 * operations like increments.
 */
public class VolatileTest {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(VolatileTest.class));

    private static volatile int counter = 0;// Try after removing volatile keyword

    public static void main(String[] args) {
        new ChangeListener().start();
        new ChangeMaker("A").start();
        new ChangeMaker("B").start();
    }

    static class ChangeListener extends Thread {
        @Override
        public void run() {
            int localCounter = counter;

            while (true) {

                // Detect change in value
                if (localCounter != counter) {

                    LOGGER.log(Level.INFO, "Reading counter: {0}", counter);
                    localCounter = counter;
                }
            }
        }
    }

    static class ChangeMaker extends Thread {

        ChangeMaker(String threadName) {
            super(threadName);
        }

        @Override
        public void run() {

            while (counter < 5) {

                // Ensuring Atomicity
                // Surround the operation with a synchronized block to ensure that only one thread can execute it at a time.
                synchronized (this) {
                    counter++; // non-atomic operation
                    LOGGER.log(Level.INFO, "Thread " + super.getName() + " incremented counter: {0}", counter);

                    // Alternatively - Use Atomic Classes.
                    // Utilize classes from the java.util.concurrent.atomic package, such as AtomicInteger, which provide
                    // atomic operations without the need for explicit synchronization.
                }

                try {
                    Thread.sleep(500); // Allow ChangeListener time to read after change in counter value.
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

