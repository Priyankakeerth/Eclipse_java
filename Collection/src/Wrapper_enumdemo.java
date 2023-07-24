import java.util.ArrayList;
import java.util.List;

public class Wrapper_enumdemo {

	
	
	enum demo
	{
		PRIYANKA,PRADEEP,DANYA//these are the constant we cannaot modify the constant
	}
	public static void main(String[] args) {
		Wrapper_enumdemo em=new Wrapper_enumdemo();
		//em.method1();
		demo m=demo.DANYA;//singleton class. it use only one object
		System.out.println(m);
		System.out.println(m.ordinal());//ordinal methods gives index position of he constant
		System.out.println(m.valueOf("Pradeep")); //it just returns the value
	demo[] ar=demo.values(); //values method return ype is array
	for(demo a:ar)
	{
		System.out.println(a);
	}
	
		
		
		

	}

	private void method1() {
		int i=100;
		//System.out.println(i);
		//Integer value=i; //Autoboxing
		Integer it=new Integer(i);//we have to convert
		List s=new ArrayList();
	//	s.add();
		System.out.println(it.equals(s));//comparing object to object
		
	
		System.out.println(s);
		//int c=value/2;
		//System.out.println(c);
		int c=it;  //unboxing object into integer value	
		System.out.println(c);  //
		
		
		
	}

}
