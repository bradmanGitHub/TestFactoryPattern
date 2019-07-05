package com.example;

public class MainClass {
	public static void main(String[] args){
		
		//new singleton install 
		DoitInterface doitServiceObj1 = DoitInterface.Factory.newInstance();
		DoitInterface doitServiceObj2 = DoitInterface.Factory.newInstance();
		
		System.out.println("Test call service method obj1: "+doitServiceObj1.process());
		System.out.println("Test call service method obj2: "+doitServiceObj2.process());
		
		//check is the same object
		System.out.println("This is the same object : "+doitServiceObj1.equals(doitServiceObj2));
	}
}
