package array_package.org;

import java.util.Scanner;

public class Even_Number {

	public static void main(String[] args) {
		Even_Number ee=new Even_Number();
	ee.mark();
//		ee.find_mark();
		
		
	}
	
		  private void mark() {
			   
			    Scanner sc=new Scanner(System.in);
			
			    System.out.print("Enter  subjects count : ");
			    int sub_count = sc.nextInt(); 
			      int[] marks = new int[sub_count];
			      for(int i=0;i<marks.length;i++)
			      {
			 
			  System.out.print("Enter the Marks : ");
		      marks[i] = sc.nextInt(); 
		      int a=marks[i]/10;
	          int b=marks[i]%10;
	       
		        if(a<b)
	        System.out.println("Conditions true: "+marks[i]);	
		        else
		        	System.out.println("condition false");
			        
			      }
			     
		  }
		  
		  void find_mark()
		  {
			  
			  int[] marks= {89,80,80,96,92};
			  
			  System.out.println("Priyanka Marks");
			
			  for(int i=0;i<marks.length;i++)
			  {
			System.out.println("Mark :"+ marks[i]);
				  int a=marks[i]/10;
				  int b=marks[i]%10;
				  if(a<b)
					  System.out.println("True: "+marks[i]);
				  else
					  System.out.println("False");
			  }
			 
			
			 
}
}