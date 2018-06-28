package com.fc.Current;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class ConcurrentTestSync {
    public static int clirntTotal=5000;
    public static int threadTootal=100;
    public  static AtomicInteger  count=new AtomicInteger(0);
    public static void main(String[] args) throws InterruptedException {
        ConcurrentTestSync concurrentTestSync=new ConcurrentTestSync();
        ConcurrentTestSync concurrentTestSync2=new ConcurrentTestSync();
        ExecutorService executorService=Executors.newCachedThreadPool();

        executorService.execute(()->{
            concurrentTestSync.text1(1);
        });
        executorService.execute(()->{
            concurrentTestSync2.text1(2);
        });
    }


    public void text1(int is){
        synchronized (this)
        {
            for (int i=0;i<10;i++){
                System.out.println("text 1:"+is+"-"+i);
            }
        }
    }

    public synchronized void text2(){
            for (int i=0;i<10;i++){
                System.out.println("text 2:"+i);
            }
    }
}
