package com.fc.Current.safeOut;

public class lazySafeV2 {
private lazySafeV2 () {
	
}

private volatile static lazySafeV2 instance=null;
public static  lazySafeV2 getInstance(){

	if(instance==null){
		synchronized (lazySafeV2.class){
			if(instance==null){
				instance=new lazySafeV2();
			}
		}	
	}
	return instance;
}
}
