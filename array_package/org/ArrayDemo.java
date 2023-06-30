package array_package.org;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		ArrayDemo ad=new ArrayDemo();  
//		ad.learn_array();
//	ad.learn_array2();
//		ad.calculate_percentage();
//		ad.find_highest();
//ad.find_low();
//		ad.find_highlow();
	ad.find_highest2();
		

	}
	void find_highlow()
	{
		
int[] marks = {100, 78, 89, 99, 92}; 
	int highest = marks[0]; //highest = 96
	int lowest=marks[0];
	int i=1; 
	while(i<marks.length)
	{
		if(marks[i]>highest)
		{
			highest = marks[i];
		}
		if(marks[i]<lowest)
		{
			lowest = marks[i];
		}
		i++;
	}
	System.out.println("Highest value"+ highest);
	System.out.println("Highest value"+ lowest);
	}
	private void find_highest2() {
	   
	int[] marks = {96, 78, 89, 99, 92}; 
	String[] sub = {"Tamil", "English", "Maths", "Science",
	        "Social"}; 
	int index_h = 0; 
	int index_l =0; 
	int highest = marks[0]; //highest = 96
	int lowest = marks[0];
	int i=1; 
	while(i<marks.length)
	{
	  if(marks[i]>highest)
	  {
	    highest = marks[i];
	    index_h = i; 
	  }
	  if(marks[i]<lowest)
	  {
	    lowest = marks[i];
	    index_l = i; 
	  }
	  i++;
	}

	System.out.println("Highest mark is "+ highest + " from "+ sub[index_h]);
	System.out.println("Lowest mark is "+ lowest + " from "+ sub[index_l]);
	}
	private void find_highest() {
		int[] marks = {100, 78, 89, 99, 92}; 
		int highest = marks[0]; //highest = 96
		int i=1; 
		while(i<marks.length)
		{
		  if(marks[i]>highest)
		  {
		    highest = marks[i];
		  }
		  i++;
		}
		System.out.println("Highest mark is "+ highest);
		
	}
	private void find_low()
	{
	int[] marks = {100, 78, 89, 99, 92}; 
	int highest = marks[0]; //highest = 96
	int i=0; 
	while(i<marks.length)
	{
	  if(marks[i]<highest)
	  {
	    highest = marks[i];
	  }
	  i++;
	}
	System.out.println("Highest mark is "+ highest);
	}
	
	private void calculate_percentage() {
	    // TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    System.out.println("How many Subjects? ");
	    int sub_count = sc.nextInt(); //5
	    int[] marks = new int[sub_count];
	    int total = 0; 
	    int i = 0; 
	    while(i<marks.length)
	    {
	      System.out.println("Enter Mark ");
	      marks[i] = sc.nextInt(); 
	      total = total + marks[i];
	      i++; 
	    }
	    System.out.println("Your total is "+ total);
	    float percentage = total/sub_count;
	    System.out.println(percentage);
	  }

	private void learn_array2() {
		int[] nandhini = {87,90,100,67,56,65};
		int i = 0; 
		while(i<nandhini.length) 
		{
		System.out.println(nandhini[i]);
		i++; 
		}
	}

	private void learn_array() {
		int[] marks=new int[6]; //array initializing length of array is 6
		marks[0] = 100;  
		marks[1] = 90; 
		marks[2] = 80;
		System.out.println(marks[0]) ;  //array works index based
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		System.out.println(marks[5]);
//		System.out.println(marks[6]); //exception throw if will exceed length of array 
	}

}
