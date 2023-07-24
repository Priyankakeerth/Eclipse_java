import java.util.ArrayList;
import java.util.Collections;

public class ArrayListdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobiles m1=new Mobiles(10000,4,5.9,"Xiaomi");
		Mobiles m2=new Mobiles(15000,6,5.5,"Samsung");
		Mobiles m3=new Mobiles(17000,4,5.9,"Oppo");
		Mobiles m4=new Mobiles(10000,4,5.9,"Apple");
		
		ArrayList al = new ArrayList(); 
		al.add(m1);
		al.add(m2);
		al.add(m3);
		al.add(m4);
		System.out.println(al);
//Collections.sort(al);
//System.out.println(al);
	}

}
