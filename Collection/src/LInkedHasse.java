import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LInkedHasse {

	public static void main(String[] args) {
		method1();
		//method2();
		// TODO Auto-generated method stub
		/*LinkedHashSet hs = new LinkedHashSet(); 
		hs.add("siva"); 
		hs.add("praveen");
		hs.add("thiyagu");
		hs.add("stalin");
		hs.add("prabakaran");
		hs.add("stalin");
		
		LinkedHashSet hs2 = new LinkedHashSet(); 
		hs2.add(10);
		hs2.add(20);
		hs2.add(45);
		//System.out.println(hs2);
		hs2.addAll(hs);
		System.out.println(hs2);
		
		System.out.println(hs);
		
		boolean result=hs.remove("ashwini");
		System.out.println(result);
		*/
	}

	private static void method2() {
		
	
	
	

	
		
	}

	private static void method1() {
		//interview program
		ArrayList al = new ArrayList(); 
	    al.add('s');
	    al.add('a');
	    al.add('b');
	    al.add('a');
	    al.add('r');
	    al.add('i');
	    al.add('b');
	    al.add('a');
	    al.add('l');
	    al.add('a');
	    
	    System.out.println(al);
	    
	   // LinkedHashSet lhs = new LinkedHashSet(al); 
	    //System.out.println(lhs);  //without duplictes print we can go for LinkedHashset
	   LinkedHashSet lhs = new LinkedHashSet();
	    LinkedHashSet lhs2 = new LinkedHashSet(); 
	    for(Object ob: al)
	    {
	      boolean added = lhs.add(ob);
	      if(added == false)
	      {
	        System.out.println(ob);
	        lhs2.add(ob);
	      }
	    }
	    System.out.println(lhs2);
	}

}
