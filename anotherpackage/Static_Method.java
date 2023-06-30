package anotherpackage;

public class Static_Method {   
	int n;
	static int m;
static void print()
{
	  
	System.out.println("Hi");
	//this.m=100;  //we cannot use this and super keyword in the static method
	//because this and super keyword refers the current object.
}
	
static void Write() {
	System.out.println("Hello,How are You");
	m=120;
	System.out.println(m);
}
	
static int addition(int a,int b)
{
	System.out.println(a+b);
	
	return a+b;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print();
		Write();
		int result=addition(10,10);
		System.out.println("THe result of static return type method:" + result);
		System.out.println(m);
	//	System.out.println(n); we cannot call non static variable, only access using obj
		
		
		
		
		
		

	}

}
