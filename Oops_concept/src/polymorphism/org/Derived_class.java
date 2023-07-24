package polymorphism.org;

public class Derived_class extends Base_class {
void sports(int a, int b,int c) {
	System.out.println(a*b*c);

}
	public static void main(String[] args) {
		Derived_class obj=new Derived_class();
		obj.sports(20); //method overloading or compile time polymorphism
        obj.sports(100, 2);
        obj.sports(10, 20, 30);

	}

}
