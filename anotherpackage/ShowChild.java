package anotherpackage;

public class ShowChild extends Showroom {
	
	ShowChild()
	{
		super();
		System.out.println("Hi im pradeep");
	}

	public ShowChild(int price, int discount) {
//	this.price =price;
//	this.discount=discount;
		this(10,20,30);
		System.out.println("Price is:"+price);
		System.out.println("Amount is:"+discount);
	}

	
	public ShowChild(int a, int b,int c) {
//		this.price =price;
//		this.discount=discount;
			System.out.println("a is:"+a);
			System.out.println("b is:"+b);
			System.out.println("c is:"+c);
		}
	public static void main(String[] args) {
		
		new ShowChild();
		new ShowChild(10,20);

	
	
	
	
	
	
	}}
