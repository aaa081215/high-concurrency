package com.fc.Current.safeOut;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class text {
    public static void main(String[] args) {
        String ks="你";
        String t=ks.substring(0,1);
        String kr[]=new String[]{t,t,t,t,t};
        if(ks.length()>5){
            for (int i=0;i<5;i++){
                kr[i]=ks.substring(i,i+1);
            }
        }
        else{
            for (int i=0;i<ks.length();i++){
                kr[i]=ks.substring(i,i+1);
            }
        }

        for(int i=0;i<5;i++){
            System.out.println(kr[i]);
        }

    }
}
