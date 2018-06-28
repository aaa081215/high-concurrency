package com.fc.Current.juc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Future {
    static class Mycalable implements Callable<String>{

        @Override
        public String call() throws Exception {
            System.out.println("do..");
            Thread.sleep(5000);
            return "Done";
        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService= Executors.newCachedThreadPool();
       java.util.concurrent.Future<String> future=executorService.submit(new Mycalable());
        System.out.println("do ..main");
      //  Thread.sleep(1000);
        System.out.println(future.get());
    }
}
