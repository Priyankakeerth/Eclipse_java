package anotherpackage;

public class Non_staticmethod {
	
	int n;
	static int m;
	private void print()
	{
		this.m=100;  //we can use this keyword in non static method, this refres the 
		System.out.println("HI");
	}
 void write()
{
	//this.n=20;
	System.out.println("How are you");
	System.out.println(n+n);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Non_staticmethod nm=new Non_staticmethod();
				nm.print();
				nm.write();
				System.out.println(m);// global variable we can acess using obj
int m=1000;   //local variable
 System.out.println(m);  //we cannot create obj for access localvariable bz its defined within themethod
 
 System.out.println(nm.n);
	}

}
