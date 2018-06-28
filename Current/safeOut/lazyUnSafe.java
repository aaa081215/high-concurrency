package com.fc.Current.safeOut;

public class lazyUnSafe {
private lazyUnSafe () {
	
}
private static lazyUnSafe instance=null;
public static  lazyUnSafe getInstance(){
	if(instance==null){
		instance=new lazyUnSafe();
	}
	return instance;
}
}
