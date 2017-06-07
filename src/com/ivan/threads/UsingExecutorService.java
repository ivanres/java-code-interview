package com.ivan.threads;

import java.util.concurrent.*;

public class UsingExecutorService {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        final ExecutorService executorService = Executors.newCachedThreadPool();
        final long startTime = System.currentTimeMillis();
        final Future<Double> future = executorService.submit(new PiCalculator());

        final double pi = future.get(10, TimeUnit.SECONDS); //blocks

        final long stopTime = System.currentTimeMillis();
        System.out.printf("Calculated Pi in %d milliseconds: %10.9f%n", stopTime - startTime, pi);
        executorService.shutdown();

    }
}

