import java.util.ArrayList;

public class Equalsmethod {
int price;
String name;
int id;
int value;
	public Equalsmethod(int price) {
		this.price=price;
		
	}
	
	public Equalsmethod() {
		ArrayList al=new ArrayList();
		al.add("priyanka");
		al.add("123");
		
		ArrayList clonemethod=(ArrayList) al.clone(); //clone method work like copy of the list
		System.out.println(clonemethod);
		
	}
	public Equalsmethod(String name, int id, int value) {
		this.name=name;
		this.id=id;
		this.value=value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Equalsmethod lap1 = new Equalsmethod(25000); 
		Equalsmethod lap2 = new Equalsmethod(26000); 
		System.out.println(lap1.equals(lap2)); 
//			Equalsmethod clo = new Equalsmethod();
			//Equalsmethod tost = new Equalsmethod("priyanka",123,500);
			//System.out.println(tost);
			//System.out.println(tost.toString());
			
			
		}
		public boolean equals(Object ob)    //equals method
		{
			System.out.println(this.price);  //this is refer the current object
			Equalsmethod ll =( Equalsmethod) ob; 
			System.out.println(ll.price);
			if(this.price>ll.price)
					return true; 
			else
					return false; 
		
		}
	
	}


