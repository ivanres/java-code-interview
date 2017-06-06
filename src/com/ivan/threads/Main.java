package com.ivan.threads;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	 final Thread separateThread = new Thread(new ThreadPrinter());
	 separateThread.start();
        for (int i = 0; i < 5; i++){
            System.out.println("From the main thread: "
                    + Thread.currentThread().getName() + " " + i
            );
            Thread.sleep(1000);
        }


    }
}

