package array_package.org;

import java.util.Scanner;

public class Array_programs {

	public static void main(String[] args) {
		Array_programs ap=new Array_programs();
		//ap.find_nooftimepresent();
ap.remove_number();
		//ap.placing_noin__lastindex();
		//ap.finding_number();
		
	

	}

	private void finding_number() {
		int[] num={1,2,3,4,5};  //linear search
		int value=4;
	
		 for(int i=0;i<num.length;i++)
		 {
			 if(num[i]==value)
			 {
				 System.out.println("the number is present"+ num[i]);
			 }
			 
		 }
		
	}

	private void placing_noin__lastindex() {
		int[] num= {1,2,3,4,5,6};
		int n=num.length;
		int[] newno=new int[n+1];
		int i;
		int value=7;
		 for( i=0;i<n+1;i++)
		 {
			 if(i<n) {
			 newno[i]=num[i];
			 //System.out.println(newno[i]);
			 }
			// else if(i<n+1)
			 else
			 {
		 newno[i]=value;
		 //System.out.println(newno[i]);
		 
			 }
		 System.out.print(newno[i]+" ");
			 }
		
	}

	private void remove_number() {
		int[] num= {1,2,3,4,5};
		int[] nonew=new int[num.length-1];
		/*int k=0;
		int j=3;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]!=j)
			{
				nonew[k]=num[i];
				System.out.println(nonew[k]);
				k++;
			}
		}
		*/
		
		int value=3; int j=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]!=3)
			{
				nonew[j]=num[i];
				System.out.println(nonew[j]);
				j++;
			}
			
		}
	}

	private void find_nooftimepresent() {
		System.out.println("Enter the no of elements in array");
		Scanner sc=new Scanner(System.in);
//		int s=sc.nextInt(); 
		int[] num=new int[sc.nextInt()];
		int i; int x; int count=0;
		System.out.println("enter array numbers");
		for(i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
//			System.out.println(num[i]);
		}
			System.out.println("Enter the no check if present r not");
			x=sc.nextInt();
			for(i=0;i<num.length;i++)
			{
			if(x==num[i])
			{
				count++;
			}
		}
			System.out.println("No of times present:"+ count);
	}
	

}
