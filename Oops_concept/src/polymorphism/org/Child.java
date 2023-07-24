package polymorphism.org;


public class Child extends Parent{ 
	public void receive()
	{
		System.out.println("Taking care of relatives"+" and friends");
//		super.receive();
	}
	public void develop_java_applications()
	  {
	    System.out.println("Java Developer");
	  }

	public static void main(String[] args) {
		
		Child obj = new Child();
		obj.develop_java_applications();
//	obj.receive();
	Parent pa=new Child();
	
	pa.cook();
	pa.receive();
//	pa.develop_java-application();
	System.out.println(obj.balance);

	
//	Parent p=new Child();
//	p.write();
//	p.fun();
//	p.cook();
	
	
			
		

		
		

	}

}
