package com.inhertance;

public class Gpay {
	private int pwd=1234;
	public void pay()
	  {
	    System.out.println("Paying through Gpay");
	  }
public static void main(String[] args) {
	Gpay gpay=new Gpay();
	gpay.pay();
	
}
}
