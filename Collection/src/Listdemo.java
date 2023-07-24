	import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Listdemo {

	public static void main(String[] args) {
		Listdemo ld=new Listdemo();
		//ld.method1();
		//ld.method2();
		//ld.method3();// will try
		//ld.method4(); //14/6/ class
		//ld.method5();
		//ld.method6();
		ld.method7();
		

	}

	private void method7() {
		
		ArrayList a = new ArrayList(); 
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40); 
		
		ArrayList b = new ArrayList(); 
		b.add(50);
		b.add(60);
		b.add(70);
		b.add(80); 
		
		a.addAll(b);
		System.out.println(a);
		
		a.retainAll(b);   //retain b only (b only present)
		System.out.println(a);
		
		List c=a.subList(0, 02);  //creating new list from this
		System.out.println(c);
		
		List cs=a.subList(0, 2);
		System.out.println(cs);
		
		
		Object[] ob=a.toArray();
		for(Object val:ob)
		{
			System.out.println(val);
		}
		System.out.println(a.size());
	}

	private void method6() {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add("siva");
		al.add(10.4f);
		al.add(true);
		al.add("sabari");
		al.add(102);
		
		for(Object ob:al)
		{
			try
			{
			Integer no=(Integer)ob;
			System.out.println(no);
			}
			catch(ClassCastException cc)
			{
				
			}
			
			}
		}
		
	

	private void method5() {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		
		int[] arr = {100,101,102,103}; 
//		for(int i=0;i<a.length;i++)
//			System.out.println(a[i]);
		//enhanced for loop - for each loop
		for(int aa: arr)
		{
			if(aa%2==0)
			System.out.println(aa);
		}
		
		ArrayList all = new ArrayList(); 
		all.add(100);
		all.add(101);
		all.add(102);
		all.add(103);
		System.out.println(al);
		
		for(Object ob:all)
		{
			//Type Casting
			Integer no = (Integer)ob; 
			if(no%2==0)
			System.out.println(ob);
		}
	}

	private void method4() {
		ArrayList a = new ArrayList();
	    a.add(10);// boolean
	    a.add(20);
	    a.add(30);
	    a.add(40);
	  
	    
	    ArrayList b = new ArrayList();
	    b.add(50);
	    b.add(60);
	    b.add(70);
	    b.add(80);
	    
	    a.addAll(2, b);
	    System.out.println("After adding b "+ a);
	    
	    ArrayList c = new ArrayList(); 
	    c.addAll(a);
	    c.addAll(b);
	    System.out.println(c);
	    System.out.println(c.contains(600));
	    
	    
	    System.out.println(c.containsAll(b));
	    
	    c.add(3,123);
	    c.add(0,"ABCD");
	    
	    System.out.println("0th Index --> " + c.get(0)); 
	    Object ob = c.get(0); //ABCD
	    Integer i = (Integer)ob; 
	    //Arithmetic Operations: 
	    //+ - * / % 
	    //Type Casting: 
	    System.out.println(i%2==0);
		
	}

	private void method3() {
		 /*int[] a= {1,2,3,4,5};
		List<int[]>list = Arrays.asList(a); //doubt
		System.out.println(list); */
		//int[] array= {100,101,102,103};
		
		
		String[] array = {"apple", "banana", "orange"};
		List<String>lis=Arrays.asList(array);	
		System.out.println(lis);
		
		
	List<String> li=Arrays.asList("a","b","c","d","e","f","g","h");
		System.out.println(li);
		System.out.println("Before sorting");
		List<String> ll=Arrays.asList("a","1","c","2","e","3","g","h");
		System.out.println(ll);
		
		Collections.sort(li);
		System.out.println("After sorting");
		System.out.println(li); 
	}

	private void method2() {
		ArrayList grocery=new ArrayList();
		grocery.add("Shampoo");
		grocery.add("Soap");
		grocery.add("Brush");
		grocery.add("Tooth Brush");
		//System.out.println(grocery);
		ArrayList veg=new ArrayList();
		veg.add("Tomato");
		veg.add("Poteto");
		veg.add("Brinjal");
		veg.add("Tomato");
		//System.out.println(veg);
		grocery.addAll(veg);
		System.out.println(grocery);
		//System.out.println(grocery.contains("Tomato"));
		grocery.remove(7);
		System.out.println(grocery);
		grocery.removeAll(veg);
		System.out.println(grocery);
		
		
		
	}

	private void method1() {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		
	ArrayList as=new ArrayList();
	as.add(50);
	as.add(60);
	as.add(70);
	as.add(80);
	
	al.addAll(as);  //we added as list into a
	System.out.println(al);
	System.out.println(al.contains(40)); //it gives boolean result
	System.out.println(al.containsAll(as));
	System.out.println(al.remove(7));//it removes index positioned value
	System.out.println(al.removeAll(as));
	System.out.println(al);
	al.addAll(2, as);  //ad the element after given this method
	System.out.println(al);
		
	}

}
