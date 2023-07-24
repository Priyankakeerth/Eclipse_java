
public class Mobiles implements Comparable{
	int price, ram; 
	double screensize; 
	String brand;
	public Mobiles(int price, int ram, double screensize, String brand) {
		super();
		this.price = price;
		this.ram = ram;
		this.screensize = screensize;
		this.brand = brand;
	}
	public String toString()
	{
		return this.brand+" "+this.price;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Mobiles mob2 = (Mobiles)this; 
		Mobiles mob1 = (Mobiles)o; 
		 String s2 = mob2.brand;
		 System.out.println(s2);
		    String s1 = mob1.brand;
		    System.out.println(s1);
		    int result = s2.compareTo(s1);
		    if(result>0)
		      return +11; 
		    else if(result<0)
		      return -98;
		
//		if(mob2.price > mob1.price)
//			return -123; 
//		else if(mob2.price >mob2.price)
//			return +100; 
		return 0;
	
	}

	

}
