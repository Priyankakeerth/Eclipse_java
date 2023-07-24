import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Practise {

	public static void main(String[] args) {
		Practise pp=new Practise();
		//pp.arraylist();
		//pp.arrayconvertedolist();
	//	pp.addsnewlistfromonelist();
		//pp.arraylistoarray();
		//pp.scannerinputprogram(); //interview program
		//pp.maximumandminumfinding();
		//pp.treeset();
		//pp.mapfunction();
		//pp.mapquestions();
		//pp.mapinterviewqs();
		//pp.mapfindcount();
		
		

	}

	private void mapfindcount() {
		LinkedHashMap lm=new LinkedHashMap();
		String name="welcometotheinstitute";
		
		
		for(int i=0;i<name.length();i++)
		{
			if(lm.containsKey(name.charAt(i)))
			{
				int count=(Integer)lm.get(name.charAt(i));
				lm.put(name.charAt(i), count+1);
			}
			else
			{
				lm.put(name.charAt(i), 1);
			}
		}
		System.out.println(lm);
		Set s=lm.entrySet();
		
		System.out.println(s);
		Iterator itr=s.iterator();
		int max=0;
		Object key="";            //doubt;
		while(itr.hasNext())
		{
			Entry entry=(Entry)itr;
			if((int)entry.getValue()>max)
					{
				max=(int)entry.getValue();
				key=entry.getKey();
					}
		}
		System.out.println(max+ "maximum present letter is ");
		
		
	}

	private void mapinterviewqs() {
		
		//Insertion order
		LinkedHashMap hs=new LinkedHashMap();
		hs.put(120, "Apple");
		hs.put(60, "Orange");
		hs.put(170, "Gova");
		hs.put(190, "Apple");
		hs.put(160, "Pomegranate");
		hs.put(200, "Strawberry");
		System.out.println(hs);
		Set s=hs.entrySet();
		int max=0;
		String fruit="";
		for(Object ob:s)
		{
			Entry entry=(Entry)ob;
			if((int)entry.getKey()>=max)
			{
				max=(int)entry.getKey();
				fruit=(String)entry.getValue();
			}
			
		}
		System.out.println(max+ "price is "+fruit);
		
		
	}

	private void mapquestions() {
		HashMap hs=new HashMap();
		hs.put(120, "Apple");
		hs.put(60, "Orange");
		hs.put(170, "Gova");
		hs.put(190, "Apple");
		hs.put(160, "Pomegranate");
		hs.put(200, "Strawberry");
		System.out.println(hs);
		Set s=hs.entrySet();
		System.out.println(s);  //converted into set
		for(Object ob:s)
		{
			Entry en=(Entry)ob;
			int price=(Integer)en.getKey();
			if(price==200)
			{
			System.out.println(en.getValue()+" key is "+en.getKey());
			}
		}
		System.out.println("***************");
		for(Object ob:s)
		{
			Entry en=(Entry)ob;
			String name=(String)en.getValue();
			if(name.endsWith("le"))
			{
			System.out.println(en.getKey()+ " ends with le " );
			}
		}
		System.out.println("***************");
		for(Object ob:s)
		{
			Entry en=(Entry)ob;
			String name=(String)en.getValue();
			if(name.equals("Apple"))
			{
			en.setValue("PineApple");
			}
			System.out.println(en.getKey()+" "+en.getValue());
		}
		System.out.println("***************");
		for(Object ob:s)
		{
			Entry en=(Entry)ob;
			String name=(String)en.getValue();
			for(int i=0;i<name.length();i++)
			{
			if(name.charAt(i)=='P')
			{
			System.out.println(en.getValue()+" key is "+en.getKey());
			}
			
		}}
		System.out.println("***************");
		for(Object ob:s)
		{
			Entry en=(Entry)ob;
			int price=(int)en.getKey();
			if(price>100)
			{
				System.out.println(en.getValue()+" Price >100 fruits");
			}
		}
		System.out.println("------------------");	
		System.out.println(hs);
		System.out.println("***************");
		for(Object ob:s)
		{
			Entry en=(Entry)ob;
			int price=(int)en.getKey();
			if(price==190)
			{
			System.out.println(en.getValue());
			}
		}
	}

	private void mapfunction() {
		HashMap hs=new HashMap();
		hs.put(101, "Priyanka");
		hs.put(103, "Danya");
		hs.put(104, "Pradeep");
		hs.put(105, "Ramil");
		hs.put(106, "Karthi");
		hs.put(107, "Vijay");
		System.out.println(hs);
		System.out.println(hs.values());
		Set s=hs.keySet();
		System.out.println(s);//we can retrive kets seperatley
Set es=hs.entrySet();
	System.out.println(es);
	System.out.println("*******************");
	
	Iterator its=es.iterator();
	while(its.hasNext())
	{  
		Entry entry=(Entry)its.next();
		System.out.println(entry.getKey()+" values "+entry.getValue());
	} 
	System.out.println("**********");
	for(Object obj:es)  //traversing the set using forloop.
	{
		Entry entry=(Entry)obj;  // we can get keys and values seperately
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
		
		
	}

	private void treeset() {
		TreeSet ts=new TreeSet();  //Treeset only allows homogeneous and will give in asending order
		ts.add(120);
		ts.add(1);
		ts.add(78);
		ts.add(90);
		ts.add(123);
		System.out.println(ts);
		
		TreeSet ss=new TreeSet();  //Treeset only allows homogeneous and will give in asending order
		ss.add("Anu");
		ss.add("Prathi");
		ss.add("Wini");
		ss.add("Divya");
		ss.add("Zara");
		ss.add("Prathi");
		System.out.println(ss);
	boolean result=	ss.contains("Zara");
	System.out.println(result);
	Iterator itr=ss.iterator();   //asending iterator
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	Iterator it=ss.descendingIterator();  //decending iterator
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	System.out.println("*************");
	System.out.println(ss.first());  //it gives the first element in the list
	System.out.println(ss.floor("Wini"));  //Doubt
	System.out.println(ss.lower("Prathi"));
	System.out.println(ss.higher("Zara"));
	
	}

		
		
		
		
		
	
	private void maximumandminumfinding() {
		
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(78);
		al.add(80);
		al.add(50);
		al.add(63);
		al.add(99);
	
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		int no=Collections.max(al);
		System.out.println(no);
		int minno=Collections.min(al);
		System.out.println(minno);
		int no3=Collections.binarySearch(al, 88);   //collections class min max binary search return type is integer
		System.out.println(no3); 
		
		Collections.shuffle(al);
		System.out.println("****************");
		System.out.println(al);
		
		
	}

	private void scannerinputprogram() {
		ArrayList marks=new ArrayList();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter marks");
		for(int i=0;i<6;i++)
		{
			
			int mark=scanner.nextInt();
			marks.add(mark);
		}
		System.out.println(marks);
		int total=0;
		for(Object s:marks)
		{
			total=total+(int)s;
		}
		System.out.println(total);
		System.out.println("size: "+marks.size());
	}

	private void arraylistoarray() {
		ArrayList fruits=new ArrayList();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Pomegranate");
		//System.out.println(fruits);
		Object[] name=fruits.toArray();
		
		//for(Object o:name)
		//{
//			System.out.println(o);
//		}
		
		//array printing
	//	for(int i=0;i<name.length;i++)
//		{
//			System.out.println(name[i]);
//		}
		
		//another method  array
		String[] str=new String[fruits.size()];
		for(int i=0;i<fruits.size();i++)
		{
			str[i]=(String) fruits.get(i);
		}
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
	}

	private void addsnewlistfromonelist() {
		ArrayList al=new ArrayList();
		al.add("Priya");
		al.add(100);
		al.add("Dani");
		al.add(1234567890l);
		ArrayList bl=new ArrayList();
		
		for(Object o:al)
		{ 
			try
			{
			String name=(String)o;
			
			bl.add(name);
			
			//System.out.println(o);
			}
			catch(ClassCastException c)
			{
				
			}
		}
		System.out.println(bl);
	}

	private void arrayconvertedolist() {
		/*Integer[] a= {100,300,200,400};  
		List c=Arrays.asList(a);
		System.out.println(c); */
		
		
		String[] fruits= {"Apple","Banana","Jackfruit","Mango","Gova","Orange"};   //Sring array convered into LIst
		List c=Arrays.asList(fruits);
		System.out.println(c);
		System.out.println(c.get(0));
		System.out.println(c.contains("Rambutan"));
		
		for(Object o:c)
		{
			String name=(String)o;
			if(name.charAt(0)=='A')
			{
				System.out.println(o);
				
			}
			
		}
		
		Collections.sort(c);  //sorting method using Collections.sort() 
		System.out.println(c);
		
		
	}

	private void arraylist() {
		//Insertion order maintains 2.Allows Duplicate 3. we can declare alldatatypes within it 
		
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(401);
		
		al.add("Priya");
		al.add(true);
		al.add(5.5f);
		al.add(234.908);
		al.add(600);
		//System.out.println(al);
		boolean s=al.contains(500);
		System.out.println(s);
		boolean s1=al.remove(5.5f);  
		System.out.println(s1);
		List c=al.subList(0, 03);  //creating sublist
		System.out.println(c);
		
		ArrayList bl=new ArrayList();
		bl=(ArrayList)al.clone();    //object clone method
		System.out.println(bl);
		
		al.addAll(bl);
		System.out.println(al);
	
		System.out.println(al.containsAll(bl));   //check bl collecion of object is there or not
		System.out.println(al.get(4));   //get method for taking particular value index
		

		
		
//		for(Object o:al)    //traversilng list using for eash loop
//		{
//			System.out.println(o);
//		}
		
//	Iterator itr=al.iterator(); //traversing the list usig iterator method
		//System.out.println(itr.next());   //next() method only give one value from the arraylist
	
		//while(itr.hasNext())   // display the next object in the arraylist
		//{
			//System.out.println(itr.next());
//		}
		
		for(Object ob:al)
		{
			
			try
			{
			int i=(int)ob;   //taking only integer value from the arrayList
			if(i%2==0)     //condition if value divided by 0
			{
		System.out.println(i);
			}
			
			}
			catch(ClassCastException e)
			{
				
			}
		}
		
		
	}

}
