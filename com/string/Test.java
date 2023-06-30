package com.string;

import java.util.Scanner;

public class Test {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj=new Test();
		//obj.find_vowels();
		//obj.vowels();
		//obj.deleting_space();
		//obj.deleting_space1();
		obj.character_count();
		
	/*	String name="priyanka";
		  
		for(int i=0;i<name.length();i++)
		{
			System.out.println(name.charAt(i));
		}
		
		String n="hi how are you";
		
		String[] n1=n.split(" ");
		for(int i=0;i<n1.length;i++)
		{
			System.out.println(n1[i]);
		}*/
		
		
	}

	private void character_count() {
		int big=-1; char place=' ';
		String name="sivasabaribala";
		int[] array=new int[name.length()];
		
		for(int j=0;j<name.length();j++)
		{
			int count=1;
		char charec=name.charAt(j);
		
		for(int i=j+1;i<name.length();i++)
		{
			if(charec==name.charAt(i))
			{
				array[i]=-1;
				count++;
			}
		}
		if(array[j]!=-1)
		{
			array[j]=count;
			if(count>big)
			{
				big=count;
				place=name.charAt(j);
			}
				
		}
		if(array[j]==1) //if(array[j]>0)
		{
		
		System.out.println(charec+" present times "+ array[j]);
		}
	}
		System.out.println(place +" present time "+ big);
		
	}
	private void deleting_space1() {
		
		String name="   amal raj";
		String name2="";
		boolean alphabet=false;
		for(int i=0;i<name.length();i++)
		{
			char letter =name.charAt(i);
			if(letter==' '&& alphabet==false)
			{
				
			}
			else
			{
				alphabet=true;
				name2 =name2+letter;
			}
		}
		System.out.println(name2);
	}

	private void deleting_space() {
		String name="   amal raj";
		
		String name2="";
		
		for(int i=0;i<name.length();i++)
		{
			char letter=name.charAt(i);
			if(letter==' ')
			{
				
			}
			else
			{
				name2=name2+letter;
			}
			}
			System.out.println(name2);
				
		}
		
		

	private void vowels() {
		
		

	/*switch(1)
		{
		case 1:
			if(name.charAt(0)=='a')
			{
				System.out.println("vowel is "+ name.charAt(0));
			}
			//else
				//System.out.println("Not present vowel");
			//break;
		case 2:
			if(name.charAt(1)=='e')
			{
				System.out.println("vowel is "+ name.charAt(1));
			}
			//break;
		case 3:
			if(name.charAt(2)=='i')
			{
				System.out.println("vowel is "+ name.charAt(2));
			}
			//break;
		case 4:
			if
			(name.charAt(3)=='o')
			{
				System.out.println("vowel is "+ name.charAt(3));
			}
			//break;
		case 5:
			if(name.charAt(4)=='u')
			{
				System.out.println("vowel is "+ name.charAt(4));
			}
			//break;
			
		}*/
		
		}
	

	private void find_vowels() 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter your name:");
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		int count=0;
		for(int i=0;i<n.length();i++)
		{
		if(n.charAt(i)=='a'||n.charAt(i)=='e'||n.charAt(i)=='i'||n.charAt(i)=='o'||n.charAt(i)=='u')
		{
			System.out.println("The vowels are: "+ n.charAt(i));
			count++;
		}
		
		}
		System.out.println("count of vowels: "+count);
		

	}

}
