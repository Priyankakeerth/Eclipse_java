package com.Practice;

public class Test_child extends Test_Parent{  //inheritance

	void sub()
	{
		int a=10;int b=10;
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_child tt=new Test_child();
		tt.add();
		tt.sub();
		tt.setAge(23);  //Getter setter -in Encapsulation pasiing values
		tt.setName("priyanka");
		System.out.println(tt.getAge()+" "+tt.getName());
		tt.mul();
		tt.division();
		
	}


	@Override  //abstract method
	void mul() {
	System.out.println(a*b);
		
	}
	
	//polymorphism override method
public void division()
{
	System.out.println(a=b);
}
}
