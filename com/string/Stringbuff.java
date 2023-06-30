package com.string;

public class Stringbuff {

	public static void main(String[] args) {
		int no=display();
		
		// TODO Auto-generated method stub
		//method();
		

	}

	private static void method() {
		// TODO Auto-generated method stub
		StringBuffer name=new StringBuffer("sivaramakrishnan");
		StringBuffer name2=new StringBuffer();
		for(int i=0; i<name.length();i++)
		{
			name2.append(name.charAt(i));
			System.out.println(name2.hashCode());
		}
		System.out.println(name2);
		
	}

	private static int display() {
		//What will happen if you put the return statement or System. Exit() on the try or catch block. Will finally block execute?
		try
		{
			System.exit(0); //jvm willstopped so cant run 
			return 100;
		}
		catch(Exception e)
		{
			return 10;
		}
		finally  //yes finally block will execute. if you give system.exit jvmwill stopped, so no more execution
		{
			System.out.println("hi");
		}
	}

}
