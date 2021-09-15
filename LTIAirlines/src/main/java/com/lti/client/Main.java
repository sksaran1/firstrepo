package com.lti.client;

import com.lti.model.Flight;

public class Main {
	public static void main(String[] args) {
		int num1=10;int num2=20;
		int a;
		 Flight f = new Flight(1001, "Mumbai","Pune");
	        System.out.print(f.getFlightId()+f.getDestination()+f.getSource()); 
	        a=add(num1,num2);
	        System.out.println(a);
	}
	int num1=10;int num2=20;
	int a=add(num1,num2);
	
	
	public static int add(int n1,int n2)
	{
		return n1+n2;
	}
	
}
