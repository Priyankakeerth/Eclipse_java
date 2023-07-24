import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		hs.add("Siva");
		hs.add("praveen");
		hs.add("thiyagu");
		hs.add("stalin");
		hs.add("prabakaran");
		hs.add("stalin");
		System.out.println(hs);
		
		HashSet hs2=new HashSet();
		hs2.add(10);
		hs2.add(30);
		hs2.add(20);
		System.out.println(hs2);
		hs2.addAll(hs);
		System.out.println(hs2);
		//here index based methods not available, because set randomly inserted value, didnot follow the index based order
		//so index based method get sublist index index of these are not available.
		boolean result=hs.remove("ashwini");
		System.out.println(result);
		

	}

}
