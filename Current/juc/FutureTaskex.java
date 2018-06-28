package com.fc.Current.juc;

import java.util.concurrent.*;

public class FutureTaskex {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

      FutureTask futureTask=new FutureTask<String>(new Callable<String>()   {
          @Override
          public String call() throws Exception {
              System.out.println("do..");
              Thread.sleep(5000);
              return "Done";
          }
      }
      );
      new Thread(futureTask).start();
      System.out.println(futureTask.get());
    }
}
