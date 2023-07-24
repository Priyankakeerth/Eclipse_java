import java.util.ArrayList;
import java.util.HashMap;

public class Arraylistdemo {

	public static void main(String[] args) {
		// TODO Au-generated method stub
		ArrayList <Integer>al = new ArrayList<Integer> (); 
		al.add(10);
		al.add(20);
		al.add(30);
		//al.add("abs");
		//al.add(false);
		Arraylistdemo ald = new Arraylistdemo(); 
		ald.add_All_items(al);
		
		HashMap<String, Integer> hm=new HashMap();
		hm.put("abc", 123);		
	}

	private void add_All_items(ArrayList al) {
		
		int total=0;
		for(Object ob:al)
		{
			total=total+(int)ob;
		}
		System.out.println(total);
	}

}
