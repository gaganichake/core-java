package com.corejava.concurrency.executorframework;

import java.util.concurrent.*;

public class ThreadPoolTuningExample {

    public static void main(String[] args) {
        int coreCount = Runtime.getRuntime().availableProcessors();
        System.out.println("coreCount: " + coreCount);

        // Custom thread pool optimized for CPU-bound tasks
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                coreCount, // Core threads
                coreCount * 2, // Maximum threads
                60, TimeUnit.SECONDS, // Keep-alive time for idle threads
                new ArrayBlockingQueue<>(50), // Queue size
                new ThreadPoolExecutor.CallerRunsPolicy() // Rejection policy
        );

        // Submitting tasks
        for (int i = 0; i < 100; i++) {
            executor.submit(() -> {
                System.out.println("Task executed by " + Thread.currentThread().getName());
            });
        }

        executor.shutdown();
    }
}

