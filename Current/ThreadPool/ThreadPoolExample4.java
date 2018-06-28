package com.fc.Current.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample4 {
    public static void main(String[] args) {
        ScheduledExecutorService executorService= Executors.newScheduledThreadPool(5);
   executorService.scheduleAtFixedRate(
           ()->{
               System.out.println("run");
           },1,3, TimeUnit.MILLISECONDS
   );

    }
}
