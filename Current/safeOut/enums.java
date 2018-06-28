package com.fc.Current.safeOut;

public class enums {
	private enums(){
		
	}
	private static enums getinstance() {
		return ss.ins.s;
	}
	private enum ss{
		ins;
		private enums s;
		ss(){
			s=new enums();
		}
		private  enums getinstances() {
			return s;
		}
		
	}

}
