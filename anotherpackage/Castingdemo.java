package anotherpackage;

public class Castingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Castingdemo cd=new Castingdemo();
	cd.widening_casting();
		//cd.narrow_casting();
				
		
		

	}

	private void narrow_casting() {
		double no=2345.9089;
		int no1=(int) no; //manual casting(we have to  give datatype)
		System.out.println(no1); 
		long l=(long) no;    //larger size passing into smaller size dataype
		System.out.println(l);
		float f=(float) no;    //double converted into float
		System.out.println(f);
		
		int a='1';
		char c=(char) a;
		System.out.println(c);
		
		
	}

	private void widening_casting() {
		// TODO Auto-generated method stub
		int no=909;
		double no1=no;   // widening casting (smaller size type passing to larger size)
		System.out.println(no1);
	
	byte nu=123;
	
	int num1=nu;
	System.out.println(num1);
	
	char ch='p'; //we cannot convert numeric type and boolean
	int name=ch;
	System.out.println(name);
	System.out.println("**************");
	
	
		char c='p';
	int numb='8';
	c=(char) numb;
	System.out.println(c);  //cannot convert
	
	 char first = '5';
	    int second = first;
	      
	    System.out.println("char value: " + first);
	    System.out.println("ASCII value: " + second);
	      
	    int num = second - 48; // ASci value(53-5=48)
	    System.out.println("int value: " + num); // 5
	    
	    
		
	}

}
