package anotherpackage;

public class Eshowroom {
	int price;
  int discount;
	
	Eshowroom()
	{
		System.out.println("Hi welcome to our showroom");
	}

	public Eshowroom(int price, int discount) {
	this.price =price;
	this.discount=discount;
		System.out.println("Price is:"+price);
		System.out.println("Amount is:"+discount);
	}

	public static void main(String[] args) {
		
		Eshowroom tv = new Eshowroom();
		
		Eshowroom fridge = new Eshowroom(); 
		Eshowroom wm = new Eshowroom();
Eshowroom ac=new Eshowroom(2500,4);
System.out.println(ac.price);
System.out.println(ac.discount);
//	tv.buy();
//	ac.buy();
//	wm.buy();
//	fridge.buy();
	}

//	private void buy() {
//	 */
		
//}

}
