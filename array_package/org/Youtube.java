package array_package.org;

import java.util.Scanner;

public class Youtube {

	
public static void main(String[] args) {
	Youtube u=new Youtube();
	u.average_view();
}
		private void average_view() {
		   
		    Scanner sc = new Scanner(System.in);
		    System.out.println("how many days you watched ");
		    int count = sc.nextInt(); //5
		    int[] marks = new int[count];
		    
		    int i = 0; 
		    float total_view = 0; 
		    while(i<marks.length)
		    {
		      System.out.println("Enter the view point ");
		      marks[i] = sc.nextInt(); 
		      total_view = total_view+ marks[i];
		      i++; 
		    }
		    System.out.println("Your total days view: "+ total_view);
		    float average = total_view/count;
		    System.out.println(average);
		  }


	}


