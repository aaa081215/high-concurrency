package com.fc.Current.threadLocal;

public class RequestHolder {
    private final static ThreadLocal<Long> re=new ThreadLocal<>();
    public static void add(Long id){
        re.set(id);
    }
    public static Long get(){
      return   re.get();
    }
    public static void remove(){
        re.remove();
    }
}
