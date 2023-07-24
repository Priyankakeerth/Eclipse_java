import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Treemap tm=new Treemap();
		//tm.method1();
		tm.method2();//interview program
		//tm.method3();
		//tm.method4();
	}

	private void method4() {
		ArrayList al = new ArrayList(); 
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

//		Iterator it = al.iterator(); 
//		System.out.println(it.next()); 
//		System.out.println(it.next()); 
//		System.out.println(it.next());
//		System.out.println(it.next());
		Iterator it = al.iterator();
		while(it.hasNext()) //Do you have next value?
		{
			int no = (int) it.next(); 
			if(no==40)
			{
				it.remove();//remove method in iterator
			}
			//System.out.println(it.next()); 
		}
		System.out.println(al);
	}

	private void method3() {
		LinkedHashMap menu = new LinkedHashMap(); 
		menu.put("Idli", 20);
		menu.put("Dosai", 300);
		menu.put("Poori",  40);
		
		Set s = menu.entrySet();
		int max = 0; 
		Object obj=""; 
		for(Object ob: s)
		{
			Entry entry = (Entry) ob;
			System.out.println(entry.getKey() + " -> "+ entry.getValue());
			if((int)entry.getValue()>max)
			{
				max = (int) entry.getValue(); 
				obj = entry.getKey();
				
				
			}
		}
		System.out.println(max + " price is for "+ obj);
		
	}

	private void method2() {
		LinkedHashMap hm=new LinkedHashMap();
		String name="amalraj";
		
		for(int i=0;i<name.length();i++)
		{
			if(hm.containsKey(name.charAt(i)))
			{
				
			int count=(Integer)hm.get(name.charAt(i));
			hm.put(name.charAt(i), count+1);
			}
			else
			{
				hm.put(name.charAt(i), 1);
			}
			
		}
		System.out.println(hm);
		//System.out.println(hm.entrySet());
		int max=0;
		Object obj="";
		Set s=hm.entrySet();
		for(Object ob:s)
		{
			Entry entry=(Entry)ob;
			
		//System.out.println(entry.getValue() +"="+ entry.getKey());
		if((int)entry.getValue()>max)
		{
		max=(int)entry.getValue();
		obj=entry.getKey();
		
		}
		System.out.println(max+ "price is "+ obj);
		
		
	}}

	private void method1() {
		// TODO Auto-generated method stub
	TreeMap hm = new TreeMap();
		hm.put("Idli", 20);
		hm.put("Dosai", 30);
		hm.put("Poori", 30);
		hm.put("Pongal", 40);
		hm.put("Dosai", 45);
		System.out.println(hm);
		//System.out.println(hm.keySet());
		System.out.println(hm.get("Poori"));
		System.out.println(hm.containsKey("Pongal"));
	//	System.out.println(hm.values());
		//System.out.println(hm.entrySet());
		Set s = hm.entrySet(); 
	//	System.out.println(s);
		
	

}
}

		
	


