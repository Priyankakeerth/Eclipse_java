package polymorphism.org;
//polymorphism allows the single action in different ways

public class Base_class {
	
	//compile time polymorphism
	
	void sports(int speed,int kilometer)//method with 2 parameter
	{
		System.out.println("State Level Sports");
		int result=speed*kilometer;
		System.out.println(result);
	}

	void sports(int speed)//method with single parameter
	{
		System.out.println("Speed 100km");
		System.out.println(speed);
		
	}
	
	//static method
	
	static float run(int point)
	{
		
		return point;
	}
	
	static int run(int point,int speed) 
	{
		return point;
}
	
}
