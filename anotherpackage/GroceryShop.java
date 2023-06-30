package anotherpackage;

public class GroceryShop { //constructor
	
		int mrp, discount, actual_price; 
		GroceryShop() //no-args Constructor	//Zero args Constructor
	
		{
			this(80,60); //we can call another constructor within constructor using this()
			System.out.println("Free delivery");
		}
		
		GroceryShop(int mrp, int discount) // parameterized constructor
		{
			this.calculate_price(100,50); //method calling within constructor
			System.out.println("Parameterized constructor output:" + (mrp-discount));
			this.mrp = mrp;    //initialize the local variable value to global variable
			this.discount = discount; 
			this.actual_price = calculate_price(mrp, discount);
			
			System.out.println("Welcome" +actual_price);
		}
		private int calculate_price(int mrp, int discount)  //method 
		{
			
			System.out.println("Calculate method output");		return mrp - discount; 
			
		}
		public static void main(String[] args) {
		
			   GroceryShop prod1 = new GroceryShop();
			   //GroceryShop pr=new GroceryShop(100, 50);
			   
			    
		  }

		}
