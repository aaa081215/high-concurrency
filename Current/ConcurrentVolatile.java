package com.fc.Current;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
public class ConcurrentVolatile {
    public static int clirntTotal=5000;
    public static int threadTootal=100;
    public volatile   static  int count=0;
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
        count++;
    }
}
