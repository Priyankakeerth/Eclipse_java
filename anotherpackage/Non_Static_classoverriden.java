package anotherpackage;

public class Non_Static_classoverriden extends Non_staticmethod{
	
	void write()
	{
		System.out.println("hi hello");
	}

	public static void main(String[] args) {
		Non_Static_classoverriden ac=new Non_Static_classoverriden();
		ac.write();  //create obj for child class and accessing
		
		Non_staticmethod sm=new Non_staticmethod();
		sm.write();  //Parent object we can access the parent logic
		
		Non_staticmethod ar=new Non_Static_classoverriden();
		ar.write();   //Dynamic Binding Parent ref child memory
		

	}

}
