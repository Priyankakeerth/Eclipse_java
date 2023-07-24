package abstraction.org;

public class ShapesChild extends Shapes{

	

	
	public static void main(String[] args) {
		ShapesChild sc=new ShapesChild();
		sc.calculate_area(10);
		sc.calculate_area(10, 20);
		sc.sleep();
		Shapes s=new ShapesChild();
		s.sleep();
	}

	@Override
	void calculate_area() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void sleep() {
		System.out.println("Hi");
		
	}

}
