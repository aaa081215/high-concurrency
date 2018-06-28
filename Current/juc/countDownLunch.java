package com.fc.Current.juc;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class countDownLunch {
    private  final static int cont=200;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService= Executors.newCachedThreadPool();
        final CountDownLatch countDownLatch=new CountDownLatch(cont);
        for (int i=0;i<cont;i++){
            final int num=i;
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
        countDownLatch.await();
        System.out.println("finish2s");
    }
    private static void test(int num) throws InterruptedException {

            Thread.sleep(100);
            System.out.println(num);
            Thread.sleep(100);


    }
}
