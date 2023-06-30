package array_package.org;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinearSearch ls=new LinearSearch();
		ls.method();

	}

	private void method() {
		int[] num= {10,20,30,40,50,60};
		int key=50;
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]==key)
			{
				System.out.println("Present key "+num[i] +" & index position is "+ i);
			}
			
		
	}

}
}
