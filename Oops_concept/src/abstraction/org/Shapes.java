package abstraction.org;

public abstract class Shapes {
	

	
	
	public static void main(String[] args) {
//		Shapes square = new Shapes(); 
//		Shapes rectangle = new Shapes(); 
//		Shapes circle = new Shapes();
//		square.calculate_area(40);
//		rectangle.calculate_area(40,30);
		
	}
	abstract void calculate_area();

	 void calculate_area(int i, int j) {
		System.out.println(i*j);
		
	}
	abstract void sleep();

 void calculate_area(int i) {
		System.out.println(i*i);
		
	}
}
