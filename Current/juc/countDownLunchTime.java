package com.fc.Current.juc;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class countDownLunchTime {
    private  final static int cont=200;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService= Executors.newCachedThreadPool();
        final CountDownLatch countDownLatch=new CountDownLatch(cont);
        for (int i=0;i<cont;i++){
            final int num=i;
            Thread.sleep(1);
            executorService.execute(
                    ()->{
                        try {
                            test(num);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        finally {
                            countDownLatch.countDown();
                        }
                    }
            );
        }
        countDownLatch.await(10, TimeUnit.MILLISECONDS);
        System.out.println("finish2s");
        executorService.shutdown();
    }
    private static void test(int num) throws InterruptedException {

        Thread.sleep(1000);
        System.out.println(num);



    }
}
