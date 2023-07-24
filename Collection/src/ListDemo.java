import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListDemo {

	public static void main(String[] args) {
		
		ListDemo ld=new ListDemo();
		//ld.method1();
		//ld.method();
		ld.method2();
		
	}

	private void method() {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(); 
	    al.add(10);
	    al.add(20.5f);
	    al.add(true);
	    al.add("abcd");
	    System.out.println(al);
	  //Class Cast Exception  
	    Collections.sort(al);
	    //int result = Collections.binarySearch(al, 200);
	  //  System.out.println(result);
	    System.out.println(al);
		
	}

	private void method2() {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(); 
		al.add("priyanka");
		al.add("ashwini");
		al.add("balaji");
		al.add("jayasurya");
		//System.out.println(al);
	//Class Cast Exception	
		Collections.sort(al);
		//int result = Collections.binarySearch(al, 200);
	//	System.out.println(result);
		System.out.println(al);
		 System.out.println(Collections.binarySearch(al, "balaji"));   //binary search its gives integer return 1 if present
		 System.out.println(Collections.binarySearch(al, "Dani")); // if not present returns -1
		    //System.out.println(result);
		   // System.out.println(al);
		
	}

	private void method1() {
		ArrayList marks=new ArrayList();
		Scanner sc = new Scanner(System.in); 
		while(true)
		{
			System.out.println("Enter mark: ");
		int mark = sc.nextInt(); 
		marks.add(mark); 
		System.out.println("type stop to break"); 
		//char ch = sc.next().charAt(0); //
		//if(ch =='N')
		String ch=sc.next();
		if(ch.equalsIgnoreCase("STOP"))
		    break; 
		}
		int total=0;
		
		for(int i=0;i<marks.size();i++)
		{
			//System.out.println(marks.get(i));
			total=total+ (Integer)marks.get(i);
			
		}
		System.out.println(total);
		
		
	}

}
