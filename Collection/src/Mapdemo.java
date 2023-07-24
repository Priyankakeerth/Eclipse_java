import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Mapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mapdemo mp=new Mapdemo();
		//mp.method1();
		mp.method2();
		
		

	}

	private void method2() {
	HashMap hm=new HashMap();
	hm.put("priya", 101);
	hm.put("Nisha", 102);
	hm.put("vini", 104);
	System.out.println(hm);
	Set obj=hm.entrySet();
	//System.out.println(obj);
	
	for(Object o:obj)
	{
		Entry entry=(Entry)o;
		//System.out.println(entry.getKey()+" "+entry.getValue());
		//System.out.println(o);
		//System.out.println(entry.getKey());
		String name=(String)entry.getKey();
		for(int i=0;i<name.length();i++)
		{
		if(name.charAt(i)=='p')
		{
			System.out.println(entry.getValue()+" key is "+entry.getKey());
		}
		}
	}
	

		
	}

	private void method1() {
		HashMap hm = new HashMap(); 
		hm.put("Idli", 20);
		hm.put("Dosai", 30);
		hm.put("Poori", 30);
		hm.put("Pongal", 40);
		hm.put("Dosai", 45);
		System.out.println(hm);
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		Set s = hm.entrySet(); 
		for(Object ob: s)
		{
	  Entry entry = (Entry) ob; 
		  String item = (String)entry.getKey(); 
	  if(item.equals("Dosai"))
	  {
		  entry.setValue(50);
		  
		      System.out.println(entry.getValue());
	    }
			//Entry entry=(Entry)ob;
			//System.out.println(entry);
		//int price=(Integer)entry.getValue();
		//System.out.println(price);
//			if(price==40)
//			{
				
//			System.out.println(entry.getKey());
//			}
			////System.out.println(ob); 
			
		}
		
	}
}


