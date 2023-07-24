import java.util.LinkedList;

public class Linkeddemo {

	public static void main(String[] args) {
		Linkeddemo ld=new Linkeddemo();
		ld.method1();
		//ld.method2();

	}

	private void method2() {
		
	}

	private void method1() {
		LinkedList al = new LinkedList(); 
		al.add(100);
		al.add(200);
		al.add("Hi");
		al.add(true);
		System.out.println(al);
		
		LinkedList al2 = new LinkedList(); 
		al2.add("Siva");
		al2.add("Stalin");
		al2.add("Anjali");
		al2.add("priyanka");
		System.out.println(al2);
		
		al.addAll(al2);
		
System.out.println(al.contains("Stalin")); 
al.remove(0);
		
	}

}
