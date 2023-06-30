package array_package.org;

public class Array_indexright {

	public static void main(String[] args) {
		Array_indexright ar=new Array_indexright();
//		ar.reverse_name();
//		ar.find_oddposition();
//		ar.addition_ofodd_position();
//	ar.adjacement_of_twoelements();
//		ar.store_oddposition_anotherarray();
//		ar.copyarray_toanother_array();
		
		
	int[] arr= {10,20,30,40};
		//original array displying
				System.out.println("Before shift the numbers");
				for(int i=0;i<arr.length;i++)
				{
						System.out.print(arr[i]+ " ");
					}
				System.out.println("\nArray after right shift");
	for(int i=0;i<2;i++)
	{
	      arr=ar.shift_rightarray(arr);
	      {
	    	  for(int j=0;j<arr.length;j++)
	    	  {
	    		  System.out.print(arr[j] +" ");
	    	  }
	      }
		}
		
//		int[] num= {10,20,30,40,50};
//		int i,j;
//		System.out.println("Before shift the numbers");
//		for(i=0;i<num.length;i++)
//		{
//			System.out.print(num[i]+ " ");
//		}
//		System.out.println("\nAfter left shifting number");
//	for( j=1;j<=2;j++)
//{
//	num   =	ar.shift_towards_left(num);
//	for( i=0;i<num.length;i++)
//	{
//		System.out.print(num[i]+ " ");
//	}
			
//}

	}

	private int[] shift_rightarray(int[] arr) {
		
		 int n=3; //length
		
		int j,last; //stores the element
			last=arr[arr.length-1];
			
			for(j=arr.length-1;j>0;j--) //logic for shift right
			{
				arr[j]=arr[j-1];
//				System.out.print(arr[j]);
			}
			arr[0]=last;
		
	return arr;
	}

		
	

	private void copyarray_toanother_array() {
		int[] a= {10,20,30,40};
		int[] b=new int[a.length]; 
		int i;
		int j=a.length-1;
		for(i=0;i<a.length;i++)
		{
		b[i]=a[j];
		System.out.println(b[i]);
		j--;
		}
		
	}

	private void store_oddposition_anotherarray() {
		int[] num= {10,20,30,40,50,60};
		int[] newno=new int[num.length/2]; 
		int i=0; int j=1;
		for(i=0;i<=newno.length-1;i++)
		{

		newno[i]=num[j];
		System.out.println(newno[i]);
		j=j+2;
		}
		
		
	}

	private void adjacement_of_twoelements() {
		int[] num= {20,30,40,50};
		
		int fn=num[0];
		int sn=num[1];
		for(int i=fn;i<=sn;i++)
		{
		if(fn<=sn)
		{
			System.out.println(fn);
			fn++;
		}
		}
		
		
	}

	private void addition_ofodd_position() {
		int[] num= {1,13,10,25,7,10};
		int i=0; int total=0;
		for(i=0;i<num.length;i++)
		{
		if(i%2!=0)
		{
			
//			System.out.print(num[i]+" ");
			total=total+num[i];
			
		}
		
	}
	System.out.println("Total value of odd position"+ total);
		
	}

	private int[] shift_towards_left(int[] num) {
		
		int temp=num[0];int i;
		for( i=0;i<num.length-1;i++)
		{
		num[i]=num[i+1];
//	     System.out.print(num[i]+" ");
		}
		
	num[i]=temp;
//		System.out.print(num[i]+" ");
	return num;
	}

	private void find_oddposition() {
		int[] num= {1,13,10,25,7,10};
		int i=0;
		for(i=0;i<num.length;i++)
		{
		if(i%2!=0)
		{
			
			System.out.print(num[i]+" ");
			
		}
		
	}
	}

	private void reverse_name() {
		   char[] name = {'s','t','a','l','i','n'}; 
		    int i = 0, j = name.length-1; 

		    while(i<j)
		    {
		    char temp = name[i]; 
		    name[i] = name[j]; 
		    name[j] = temp; 
		    i++; 
		    j--; 
		    }

		    for( i=0; i<name.length; i++)
		    {
		    System.out.print(name[i]+" "); 
		    }
		    
		
	}

}
