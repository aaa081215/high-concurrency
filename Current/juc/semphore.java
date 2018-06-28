package com.fc.Current.juc;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class semphore {
    private  final static int cont=2000;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService= Executors.newCachedThreadPool();

        final Semaphore semaphore=new Semaphore(200);
        for (int i=0;i<cont;i++){
            final int num=i;
            executorService.execute(
                    ()->{
                        try {
                            semaphore.acquire();
                            test(num);
                            semaphore.release();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        finally {

                        }
                    }
            );
        }
        System.out.println("finish2s");
    }
    private static void test(int num) throws InterruptedException {
            Thread.sleep(1000);
            System.out.println(num);
    }
}
