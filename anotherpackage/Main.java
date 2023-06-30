package anotherpackage;

public class Main {//Rough programs for static and non-static global and local
	static int a=10,b=10;
	static String name="Priyanka";
	int c=10,d=10;
	static void pay()
	{
		System.out.println("Upi");
	}
	public static void main(String[] args) {
		System.out.println(name);
		System.out.println(a);
		System.out.println(Main.b);
		Main m=new Main();
		System.out.println(m.c);
				int d=m.c;
				System.out.println(d);
				pay();
				Main.pay();
	}

}
