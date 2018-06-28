package com.fc.Current;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentTestAtomic2 {
    public static int clirntTotal=5000;
    public static int threadTootal=100;
    public  static LongAdder count=new LongAdder();
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService= Executors.newCachedThreadPool();
        final Semaphore semaphore=new Semaphore(threadTootal);
        final CountDownLatch countDownLatch=new CountDownLatch(clirntTotal);
        for(int i=0;i<clirntTotal;i++){

            executorService.execute(()->{
                try {
                semaphore.acquire();
                add();
                semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                countDownLatch.countDown();
            });

        }
        //判断所有线程执行完
         countDownLatch.await();
         executorService.shutdown();
         System.out.println("count"+count);
    }
    public  static void add(){
      count.increment();
    }
}
