import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Trees {

	public static void main(String[] args) {
Trees ts=new Trees();
ts.method1();

		
		
		//		
		
		//Players mahi = new Players(100);
//		Players virat = new Players(90); 
//	Players rohit = new Players(110);
		
		
		Players mahi = new Players("MSD", 100);
		
		Players virat = new Players("VK",90); 
		Players rohit = new Players("RS",110);
		
ArrayList al = new ArrayList(); 
al.add(mahi);
al.add(virat);
al.add(rohit);
System.out.println(al);
//Collections.sort(al, new Players());



TreeSet ss=new TreeSet(al);
System.out.println(ss); 



	}

	private void method1() {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(); 
		al.add("deva");
		al.add("hari");
		al.add("selva");
		//System.out.println(al);
		
		//Asending order
		      TreeSet ts = new TreeSet(); 
		ts.add("siva"); 
		ts.add("praveen");
		ts.add("thiyagu");
		ts.add("stalin");
		//ts.add(123);  //treeset only allows homegenous datatypes 
		ts.add("prabakaran");
		ts.add("stalin");
//		System.out.println(ts); 
//		System.out.println(ts.addAll(al));
//		System.out.println(ts);
//		ts.clear();
//		System.out.println(ts);
		
//ArrayList ab=(ArrayList)ts.clone();	  //doubt
//System.out.println(ab);
		
TreeSet ss=new TreeSet();
ss.add(123);
ss.add(234);
ss.add(456);
//HashSet sv=(HashSet)ss.clone();  // cannot copy the anotherset value
//System.out.println(sv);

ArrayList ac=new ArrayList();
ac.add(98023);
ac.add(7895);
ac.add(456);
ac.add(456);

LinkedList ll=new LinkedList(ac);
System.out.println(ll);
TreeSet g=new TreeSet(ac);

System.out.println(g);

HashSet s=new HashSet(ac);  //we can give another list object to this list
System.out.println(s);
System.out.println(ss.comparator());



		
	}
	

}
