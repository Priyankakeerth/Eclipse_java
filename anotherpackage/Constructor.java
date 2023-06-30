package anotherpackage;
//a constructor initialize the object when its created,it has the same name as its class,syntactically similar to the method,
//constructor have no explicit return type
public class Constructor {
	
 int num;                                                // globalvariable, defult it have 0 value.
Constructor()                        //this is constructor
{
num=100;      //we can use same variable name now as a local no=100 constructor it will assign 100 to global variable
	System.out.println(num);
}
 Constructor(int num)
{
	this.num=num;                                  //we cannot call local variable/
System.out.println(num);
	
}
void print()
{
int i=20; 
this.num=i;          //num 20 is the local variable for print method we use same variable namer local as a global.
	System.out.println(i);
}
	public static void main(String[] args) {
	Constructor t=new Constructor();                      //when we initialize the object the constructor is called automatically
		//System.out.println(t.num); 
t.print();                                                   //we can call method using object only
System.out.println(t.num);  
Constructor n=new Constructor(111);
System.out.println(n.num);	
		
		
	}

}
