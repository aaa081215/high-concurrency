package com.fc.Current.safeOut;

public class hungrySafe {
	
private hungrySafe () {
	
}

private static hungrySafe instance=new hungrySafe();
public static hungrySafe getInstance(){
	return instance;
}
}
