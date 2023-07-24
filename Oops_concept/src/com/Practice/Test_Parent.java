package com.Practice;

public  abstract class Test_Parent{
	//Encapsulation
	private String name;
	private int age;
	//Getter setter
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//Global variable 
int a=100,b=50;



//abstarct method
abstract void mul();

//normal Method
public void add()
{
	
	System.out.println(a+b);
	
}


public void division()
{
System.out.println(a/b);
}

	public static void main(String[] args) {
		//cannot instantiate to absract class	
		//cannot overload because cannot pass values from this class 
		

	}

	
}
