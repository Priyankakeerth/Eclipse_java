import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class Linkedhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Linkedhashmap lm=new Linkedhashmap();
		lm.method1();

	}

	private void method1() {
		LinkedHashMap hm = new LinkedHashMap();
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
		
	}

}
}