package com.fc.Current.safeOut;

public class lazySafeV {
private lazySafeV () {
	
}
private static lazySafeV instance=null;
public static synchronized lazySafeV getInstance(){
	if(instance==null){
		instance=new lazySafeV();
	}
	return instance;
}
}
