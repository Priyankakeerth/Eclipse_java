import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Testclass {

	public static void main(String[] args) {
		Testclass tc=new Testclass();
		//tc.test1();
		//tc.test2();
		//tc.arraylist_to_array();
		//tc.test3();
		//tc.conttains();
		//tc.traversingList();
		//tc.convert_Listtoarray();//
		//tc.convertinglist();//doubt
		//tc.convertingstringListtoarry();
		//tc.arraysaslist();
		//tc.lengthofarraylist();
		//tc.minmaxincollection();
		tc.doubt();
		
	}

	private void doubt() {
		Scanner sc=new Scanner(System.in);
		ArrayList Line1=new ArrayList();
		System.out.println("Enter 5 numbers");
		for(int i=0;i<5;i++)
		{
			int no=sc.nextInt();
			Line1.add(no);
		}
		System.out.println(Line1);
		
		System.out.println(Line1.get(3));
	}

	private void minmaxincollection() {
	ArrayList no=new ArrayList();
	no.add(100);
	no.add(600);
	no.add(50);
	no.add(109);
	no.add(900);
	int max=Collections.max(no);
	
	System.out.println(max);
	int min=Collections.min(no);
	System.out.println(min);
	int result=Collections.binarySearch(no, 109);//gives the index position of the value
	System.out.println(result); 
	Collections.reverse(no); //reverse the list
	System.out.println(no);
	
		
	}

	private void lengthofarraylist() {
		ArrayList<String> name=new ArrayList<>();
		name.add("Priyanka");
		name.add("vini");
		name.add("siva");
		name.add("zara");
		Object c=Collections.class;  //collection.class is gives java.util.collections
		System.out.println(c);
	

/*System.out.println(name.size());
Collections.sort(name); //collections is a class and collections.sort()is a static method
System.out.println(name);
//Collections.reverse(name); //reverse order
//System.out.println(name);
Collections.sort(name,Collections.reverseOrder()); //reverse order
System.out.println(name);
name.add(04, "Saba");
System.out.println(name); //adding elenment in particular position

name.remove(4);
System.out.println(name); */

		
		
	}

	private void arraysaslist() {
		String[] str= {"priya","vini","zara"};
		
		ArrayList name=new ArrayList();
		
		List c=Arrays.asList(str); //
		System.out.println(c);
		
		//or
		
		for(int i=0;i<str.length;i++)
		{
		name.add(str[i]);	
		}
		System.out.println(name);
		
		
	}

	private void convertingstringListtoarry() {
	ArrayList<String> name=new ArrayList<>();
	name.add("Priyanka");
	name.add("vini");
	name.add("siva");
	name.add("zara");
	
	String[] s=new String[name.size()];
	for(int i=0;i<name.size();i++)
	{
		s[i]=name.get(i);
	}
	for(String str:s)
	{
		System.out.println(str);
	}
		
	}

	private void convertinglist() {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(500);
		al.add(700);
		al.add(600);
		al.add(800);
		al.add(400);
		
	Object[] p=al.toArray();  
	for(Object aa:p)
	{
		System.out.println(aa);
	}
		
		
		
		
	}

	private void convert_Listtoarray() {
		ArrayList al=new ArrayList();
		al.add(500);
		al.add(700);
		al.add(600);
		al.add(800);
		al.add(400);
		
		Object[] a=al.toArray();
//		for(Object aa:a)
//		{
//		System.out.println(aa);	
//		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
	}

	private void traversingList() {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(101);
		al.add(103);
		al.add(104);
		al.add(105);
		
		for(Object ic:al)
		{
			System.out.println(ic);
		}
		
	}

	private void conttains() {
		ArrayList no=new ArrayList();
		no.add(10);
		no.add(20);
		no.add(30);
		no.add(40);
		
		//System.out.println(no);
		if(no.contains(20))
		{
			System.out.println("yes present");
		}
		else
			System.out.println("not present");
		
	}

	private void test3() {
		ArrayList<String> name=new ArrayList();
		name.add("Priyanka");
		name.add("Siva");
		name.add("Ashwini");
		name.add("Anjali");
		Collections.sort(name); //ascending order by sorted
		//int i=0;
		for(String s:name)
		{
			if(s.charAt(0)=='A')
			{
		 System.out.println(s);
			}
			
		}
		//i++;
		
		
	}

	private void arraylist_to_array() {
		
		ArrayList fruits=new ArrayList();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Pomegranate");
		System.out.println("*******Copyof method************");
		String[] fr=Arrays.copyOf(fruits.toArray(), fruits.size(),String[].class);
		for(String s:fr)
		{
			System.out.println(s);
		}
		
		System.out.println("******List to string array convertion**********");
		
	String[] str=new String[fruits.size()];
	for(int i=0;i<fruits.size();i++)  
	{
	  str[i]=(String) fruits.get(i);
	} 
	
	/*for(int i=0;i<str.length;i++)
	{
		System.out.println(str[i]);
	} */
	
	for(String s:str)
	{
		System.out.println(s);
		
	} 
	System.out.println("*****List to Object array convertion*******");
		Object[] ob=fruits.toArray();
	for(Object b:ob)
	{
		System.out.println(b);
	}
	System.out.println("__________________");
	System.out.println(fruits.isEmpty());  //checking is empty or not
	System.out.println(fruits.contains("Mango"));  //checking if present or not
	System.out.println(fruits.size());//size of the list
				
		
	}

	private void test2() {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add("abcd");
		a.add(true);
		a.add(123.4);
		a.add(4.2f);
		a.add(7010022625l);
		a.add('C');
		ArrayList b=new ArrayList();
		
		for(Object o:a)
		{
			try
			{
			String letter=(String)o;   //type casting
			
			//System.out.println(letter);
            b.add(letter);
            System.out.println(b);   //doubt add string into seperate list
			}
			catch(ClassCastException cc)
			{
				
			}
		}
		
	}

	private void test1() {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add("abcd");
		a.add(true);
		a.add(123.4);
		a.add(4.2f);
		a.add(7010022625l);
		a.add('C');
		//System.out.println(a);
		/*for(Object on:a)  //traversing the list foreach loop
		{
			System.out.println(on);
		}
		*/
		
		for(Object ob:a)
		{
			try
			{
			Integer no=(Integer)ob; //taking integer value only
			System.out.println(no);
			}
			catch(ClassCastException cc)
			{
			}
			}
		}
		
		
		
		
		
		
	}


