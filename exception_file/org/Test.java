package exception_file.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test ts=new Test();
		//ts.method1();
		//ts.method2();
		//ts.method3(); userdefined exception
		try {   
			ts.method4();  //throws
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println("Interrupted exception occured");
		}
		
		
	}
	private void method4() throws InterruptedException {
		
		Thread.sleep(500);
		
		System.out.println("end of the program");
	}
	private void method3() {
		// throw
		
		double bal=700, withdraw=1000;
		try
		{
		if(bal<withdraw)
		{
			throw new InsufficientBalanceException(bal-withdraw);  //userdefined exception
			
		}
		}
		catch (InsufficientBalanceException e)
		{
			System.out.println("NOt enough money");
		}
		
	}
	private void method2() {
		// CompileTimeException or checked exception
		
		File file=new File("abc.txt");
		try {
			FileInputStream fs=new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//method print the errors trace
		}
		
		
	}
	private void method1() {
		// Runtime or Unchecked exception

		int a=10; int b=0;
		int c=0;
		try
		{  //error posible area
		int arr[]=null;   //throw null pointer exception
		System.out.println(arr[1]);
			
			
		c=a/b;
		}//will throw arithmatic exception
		
		catch(ArithmeticException e) //exception handling area
		{
			System.out.println("ArithmeticException occured");
		}
		catch(NullPointerException e) //exception handling area
		{
			System.out.println("NullPointerException occured");
		}
		
		System.out.println(c);
		
		System.out.println("End of the program");

	
		
	}

}
