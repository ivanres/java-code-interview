package com.ivan.threads;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class UsingExecutors {

    public static void main(String[] args) {
	  final Executor executor = Executors.newCachedThreadPool();
	  executor.execute(new ThreadPrinter());
	  executor.execute(new ThreadPrinter());
	  executor.execute(new ThreadPrinter());
	  //This code does not terminate
    }
}

