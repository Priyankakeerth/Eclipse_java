package anotherpackage;

public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursionDemo rd=new RecursionDemo();
		rd.display(10);

	}

	private void display(int no) {
		// TODO Auto-generated method stub
		System.out.print(no+" ");
		no = no+10;
		if(no<=50) 
		{
			
		display(no); //method caliing itself
		}
		
	}

}
